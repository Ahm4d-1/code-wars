import re

def chuck_push_ups(st): 
    if not isinstance(st, str):
        return 'FAIL!!'
    countRegex = re.compile(r'([01]+\w*)+')
    binaryCounts = countRegex.findall(st)
    max = 0
    for binary in binaryCounts:
        currentCount = int(re.sub(r'[a-zA-Z2-9_]', '', binary), 2)
        if currentCount > max:
            max = currentCount
    if binaryCounts != [] and max == 0 :
        return 0
    return max if max != 0 else 'CHUCK SMASH!!'
    
print(chuck_push_ups('1ee1gf00t10h1011tr00'))