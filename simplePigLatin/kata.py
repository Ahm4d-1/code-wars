

def pig_it(text: str):
    pigged = ''
    marks = '?!.$#@^'
    for word in text.split():
        if word in marks:
            pigged += word + ' '
            continue
        pigged += word[1:] + word[0] + 'ay '
    return pigged[:-1]



print(pig_it('Pig latin is cool'))