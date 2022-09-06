

def tribonacci(signature, n):
    output: list = signature
    for i in range(3, n):
        sum = output[i-1] + output[i-2] + output[i-3]
        output.append(sum)

    return output[:n]

print(tribonacci([1, 1, 1], 0))