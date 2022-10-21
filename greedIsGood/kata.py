"""
 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
"""
values = {
    '1': 1000,
    '6': 600,
    '5': 500,
    '4': 400,
    '3': 300,
    '2': 200,
    '1s': 100,
    '5s': 50,
    '4s': 0,
    '3s': 0,
    '2s': 0,
    '6s': 0
}
def score(dice: list):
    score = 0
    numbers = {}
    # get numbers with their counts
    for i in range(len(dice)):
        number = dice[i]
        numbers[number] = dice.count(number)
    # calculate score
    for num, count in numbers.items():
        if count > 2: 
            score += values[str(num)]
            count -= 3
        for i in range(count):
            score += values[str(num)+'s']

    return score

print(score([2, 4, 4, 5, 4]))