"""
Write a function, persistence, that takes in a positive parameter num and returns 
its multiplicative persistence, which is the number of times you must multiply 
the digits in num until you reach a single digit.
"""

def persistence(n: int):
    strNum = str(n)
    count = 0
    while len(strNum) > 1:
        count+=1
        sum = 1
        for num in strNum:
            sum *= int(num)
        
        strNum = str(sum)
    
    return count

print(persistence(999))