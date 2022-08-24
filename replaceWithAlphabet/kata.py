
chars = 'abcdefghijklmnopqrstuvwxyz'
char_numbers = {chars[i] : i+1 for i in range(26)} # create number of characters

def alphabet_position(text: str):
    # print(char_numbers)
    output = ''
    for char in text.lower():
        try: 
            output += str(char_numbers[char]) + ' '
            # print(char)
            # print(char_numbers[char])
        except :
            continue

    
    return output[:-1]



print(alphabet_position("The sunset sets at twelve o' clock."))