def order(sentence):
    words = sentence.split(" ")
    out = ''
    for i in range(len(words) + 1):
        for word in words:
            if str(i) in word:
                out += word + ' '
    return out

print(order("4of Fo1r pe6ople g3ood th5e the2"))