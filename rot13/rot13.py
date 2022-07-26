def rot13(plaintext):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    capital = alphabet.upper()
    ciphertext = ''

    for char in plaintext:
        if (char in alphabet):
            index = alphabet.index(char)
            ciphertext += alphabet[(index+13) % 26]
        elif (char in capital):
            index = capital.index(char)
            ciphertext += capital[(index+13) % 26]
        else:
            ciphertext += char


    return ciphertext

print(rot13('EBG13 rknzcyr.'))