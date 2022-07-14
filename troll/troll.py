

def disemvowel(string_):
    vowels = ['a', 'e', 'i', 'u', 'o']
    newString = ''
    for char in string_:
        if (char.lower() not in vowels):
            newString += char

    return newString


print(disemvowel("This website is for losers LOL!"))