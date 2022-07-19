/* 
Write function heron which calculates the area of a triangle with sides a, b, and c (x, y, z in COBOL).

Output should have 2 digits precision.
*/

function heron(a, b, c) {
    const S = (a + b + c) / 2;
    return Math.sqrt(S * (S - a) * (S - b) * (S - c));
}

heron(3, 4, 5);