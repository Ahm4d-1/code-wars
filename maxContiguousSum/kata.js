
function maxContiguousSum (arr) {
    let currentStreak = [];
    let currentSum = 0;
    let highestSum = 0;
    let highestStreak = [];

    for (const element of arr) {

        currentSum += element;
        if (currentSum > highestSum)
            highestSum = currentSum
        
        if (currentSum < 0)
            currentSum = 0;

        // if (!((currentSum + element) < highestSum)) {
        //     currentStreak.push(element);
        //     currentSum += element;
        //     // highestSum = Math.max(currentSum, highestSum);
        // }
        // else {
        //     if (currentSum > highestSum) {
        //         highestSum = currentSum;
        //         highestStreak = currentStreak;
        //     } 
        //     currentStreak = [];
        //     currentSum = 0;
        // }
        // console.log(`currentStreak for element ${element} is ` + currentStreak);
    }

    // if (currentSum > highestSum) {
    //     highestSum = currentSum;
    //     highestStreak = currentStreak;
    // }

    console.log(highestStreak);
    return highestSum;
}


console.log(maxContiguousSum([3, -4, 8, 7, -10, 19, -3]));