def move_zeros(lst: list):
    final = [item for item in lst if item != 0]
    [final.append(0) for zero in range(lst.count(0))]
    return final


print(move_zeros([1, 2, 0, 1, 0, 1, 0, 3, 0, 1]))