function dontGiveMeFive(start, end) {
    let counter = 0;
    for (let index = start; index <= end; index++) {
        if(!index.toString().includes('5')) counter++;
    }
    return counter;
}

console.log(dontGiveMeFive(4, 17));