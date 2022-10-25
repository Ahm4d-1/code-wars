import math

def find_nb(m: int):
    sum = 0
    cubeCount = 0
    index = 1
    while sum < m:
        sum += round(math.pow(index, 3))
        cubeCount += 1
        index += 1
    return cubeCount if sum == round(m) else -1

# 41782
print(find_nb(10252519345963644753026))