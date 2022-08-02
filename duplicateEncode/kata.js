/*
The goal of this exercise is to convert a string to a new string 
where each character in the new string is "(" if that character appears only once 
in the original string, or ")" if that character appears more than once in the 
original string.  Ignore capitalization when determining if a character is a duplicate.
*/

function duplicateEncode(word){
    word = word.toLowerCase();
    let out = '';
    let letters = [...word];
    console.log(letters);
    for (const char of word) {
        if (letters.indexOf(char) !== letters.lastIndexOf(char)) out += ')';
        else out += '(';
        console.log(char);
    }

    return out;
}

console.log(duplicateEncode("Success"));