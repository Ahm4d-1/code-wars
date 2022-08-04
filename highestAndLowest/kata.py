

def high_and_low(numbers):
    numbers = numbers.split(" ")
    values = []
    for num in numbers:
        values.append(int(num))
    return "{} {}".format(max(values), min(values))

print(high_and_low("1 2 3"))