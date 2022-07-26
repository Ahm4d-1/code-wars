
import math


def dont_give_me_five(start, end):
    nonFiveCounter = 0
    for i in range(start, end+1):
        nonFiveCounter += containsFive(i)
    
    return nonFiveCounter

def containsFive(number):
    while(number != 0):
        if (number % 10 == 5):
            return 0
        number = int(number/10)
    return 1

print(dont_give_me_five(-9000000000000000000, 9000000000000000000))