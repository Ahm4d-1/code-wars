/*
 * Problem:
 * Given an array of integers, find the one that appears an odd number of times.
 * 
 * There will always be only one integer that appears an odd number of times.
 */

/*
 * Solution:
 * 1. create a map that will hold the integer and its count, for every integer
 * 2. loop through all integers, add them to the counting maps
 * 3. loop through the counting maps, and return the key where the its value is
 * odd
 */

function findOdd(A) {
    const counts = [];

    A.forEach(number => {
        const obj = counts.find(obj => obj.key === number);
        if (obj) {
            const index = counts.indexOf(obj);
            counts.splice(index, 1);
            counts.push({
                key: number,
                value: obj.value + 1,
            })
        } else {
            counts.push({
                key: number,
                value: 1,
            })
        }
    });

    let odd = 0;
    counts.forEach(object => {
        if (object.value % 2 != 0) {
            odd = object.key;
            return;
        }
    })
    return odd;
}

console.log(findOdd([1, 1, 2]));