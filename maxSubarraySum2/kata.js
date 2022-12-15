function findSubarrMaxSum(arr){
    let currentStreak = [];
    let currentSum = 0;

    let highestSum = 0;
    let highestStreak = [];
    let filteredHighestSum = [];

    for (const element of arr) {

        currentSum += element;
        currentStreak.push(element);
        console.log(`currentSum = ${currentSum}`);
        console.log(`currentStreak = ${currentStreak}`);
        console.log('-------------------------------');
        if (currentSum >= highestSum) {
            highestSum = currentSum;
            highestStreak.push(currentStreak.slice());
        }
        
        if (currentSum < 0) {
            currentSum = 0;
            currentStreak = []
        }

    }

    // clean highestStreak array

    for (const streak of highestStreak) {
        console.log(streak);
        const sum = streak.reduce((a, b) => a + b, 0);
        if (sum === highestSum)
            filteredHighestSum.push(streak);
    }

    console.log(highestSum);
    console.log(highestStreak);
    console.log(filteredHighestSum);
    if (filteredHighestSum.length <= 1) {
        filteredHighestSum = filteredHighestSum[0];
    }
    return [filteredHighestSum, highestSum]
}

console.log(findSubarrMaxSum([4, -1, 2, 1, -40, 1, 2, -1, 4]));