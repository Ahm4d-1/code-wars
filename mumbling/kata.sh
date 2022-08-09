#!/bin/bash
accum () {
    string=$1
    len=${#string}
    counter=1
    output=""
    echo ${#string}

    while [ $counter -le $len ]
    do
        char=${string:counter-1:1} # since we start from 1
        echo "counter = ${counter}"
        echo ${char}
        for ((i=0; i<${counter}; i++)); 
        do 
            if [ $i -eq 0 ]; then
                output+="${char^}" # uppercase the first letter
            else
                output+="${char,}";
            fi
        done
        output+="-"
        ((counter++))
    done

    output=${output:0:-1}
    echo ${output}
}
accum "$1"