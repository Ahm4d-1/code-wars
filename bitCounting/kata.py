
def count_bits(n):
    return bin(n).strip('0b').count('1')

print(count_bits(1234))