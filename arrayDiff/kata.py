"""
It should remove all values from list a, which are present in list b keeping their order.
"""
def array_diff(a:list, b:list):
    # if (len(b) == 0 or len(a) == 0):
    #     return
    for num in a:
        if num in b:
            a = list(filter((num).__ne__, a))
    return a 

print(array_diff([1, 2, 2], [2]))