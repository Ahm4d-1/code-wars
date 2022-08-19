function order(sentence){
    const words = new String(sentence).split(" ");
    let output = "";
    for (let i = 0; i <= words.length; i++) {
        for (const word of words) {
            if (word.includes(i.toString())) {
                output += word + " ";
            }
        }
    }
    return output.trimEnd();
}

console.log(order("4of Fo1r pe6ople g3ood th5e the2"));