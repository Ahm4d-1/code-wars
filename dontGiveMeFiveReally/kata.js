

function dontGiveMeFive(start, end) {
    let counter = 0;
    // get 'start' to a number containing five
    while (!start.toString().includes('5')) {
        start++;
        if (!start.toString().includes('5'))
            counter++;
    }

    for (let index = start; index <= end; index += 5) {
        console.log(index);
        counter += 4;
        if (!index.toString().includes('5'))
            counter++;
        console.log('couynter = ' + counter);
        if (index + 5 > end) {
            for (let j = index; j <= end; j++) {
                console.log('j = ' + j);

                if (!j.toString().includes('5'))
                    counter++;

            }
            break;
        }
    }
    return counter;
}

console.log('value = ' + dontGiveMeFive(4, 17));