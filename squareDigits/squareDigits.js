
/* Steps: 
    1. convert number to string
    2. loop through the string, convert every digit to integer, then square it
    3. convert the integer back to string and append its value to the newstring variable
    4. convert the new string variable to integer and return it 
*/

function squareDigits(num) {
    let numString = String(num);
    let string = '';
    for (const char of numString) {
        let num = Number(char);
        num = num * num;
        string += String(num);
    }
    return Number(string);
}

console.log(squareDigits(3212));