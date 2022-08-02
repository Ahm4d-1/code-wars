/* 
Steps:
loop through every char:
    1. if char is left, add to lefts list, 
    2. else if right, add to rights list
    3. else, return false (wrong character)
loop through
count the size of rights & lefts, if equal return true
*/

function validParentheses(parens) {
    let lefts = [];
    let rights = [];
    for (const char of parens) {
        if (char === ')') lefts.push(char);
        else if (char === '(') rights.push(char);
      
        if (lefts.length > rights.length) return false;
    }
    return rights.length === lefts.length;
}

console.log(validParentheses("((())"));