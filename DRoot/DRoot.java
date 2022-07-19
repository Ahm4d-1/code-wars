public class DRoot {

    public static void main(String[] args) {
        System.out.println(digital_root(456));
    }

    /*
     * Problem :
     * Digital root is the recursive sum of all the digits in a number.
     * 
     * Given n, take the sum of the digits of n.
     * If that value has more than one digit, continue reducing in this way until a
     * single-digit number is produced.
     * The input will be a non-negative integer.
     * 
     * Steps: (will try recursion)
     * 1. if n is a single digit, return n
     * 2. convert n to string, and loop through every character
     * 3. convert every character to the integr value, and add it to the local sum
     * 4. if the local sum is more than a single digit, call digital_root again with that value
     */
    public static int digital_root(int n) {
        if (n < 10 && n > 0)
            return n;

        String number = String.valueOf(n);
        int sum = 0;
        for (char ch : number.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        
        if (sum >= 10) {
            sum = digital_root(sum);
        }

        return sum;
    }
}