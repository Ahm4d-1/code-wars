from operator import indexOf


def two_sum(numbers: list, target: int):
    newlist = numbers
    for number in numbers:
        newlist = newlist[1:]
        for n in newlist:
            if (number + n == target): 
                return (numbers.index(number), numbers.index(n, 1))


print(two_sum([2, 2, 3], 4))