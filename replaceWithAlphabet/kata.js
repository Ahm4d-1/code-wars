
chars = 'abcdefghijklmnopqrstuvwxyz';
charNumbers = {}
function alphabetPosition(text) {
    // Fill charNumbers
    let i = 1
    for (const char of chars) {
        charNumbers[char] = String(i)
        i++;
    }

    // create output
    let output = ''
    for (const char of text.toLowerCase()) {
        // console.log(char);
        // console.log(charNumbers[char]);
        if (charNumbers[char] === undefined) continue;
        output += charNumbers[char] + ' ';
    }
    // console.table(charNumbers)

  return output;
}


console.log(alphabetPosition("The sunset sets at twelve o' clock."));