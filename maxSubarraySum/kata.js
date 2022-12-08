
function maxSubarraySum (arr) {
    let currentSum = 0;
    let highestSum = 0;

    for (const element of arr) {

        currentSum += element;
        if (currentSum > highestSum)
            highestSum = currentSum
        
        if (currentSum < 0)
            currentSum = 0;
    }

    return highestSum;
}


console.log(maxSubarraySum([3, -4, 8, 7, -10, 19, -3]));