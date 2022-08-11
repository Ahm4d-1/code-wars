"""
Take 2 strings s1 and s2 including only letters from a to z.
Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
Take 2 strings s1 and s2 including only letters from a to z.
"""
def longest(a1:str, a2:str):
    a1 = a1 + a2
    output = ''
    for char in a1:
        if char not in output:
            output += char
            print(char)
    return ''.join(sorted(output))


print(longest('xyaabbbccccdefww', 'xxxxyyyyabklmopq'))