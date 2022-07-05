import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    public static void main(String[] args) {
        System.out.println(sumDigPow(1, 135));
    }

    /*
     * Steps:
     * 1- loop through the range (start, finish)
     * 2- for every entry do:
     * - take last digit by dividing by 10
     * - square the digit and save it
     * - do the same for all digits in the current entry
     * - add all digits and compare them to the parent entry,
     * - if they match, add them to solution list
     */
    public static List<Long> sumDigPow(long start, long end) {
        List<Long> solution = new ArrayList<>();

        for (long i = start; i <= end; i++) {

            long digitsSum = sumIndividualDigits(i);
            if (digitsSum == i)
                solution.add(i);
        }

        return solution;
    }

    private static long sumIndividualDigits(long current) {
        long sum = 0;
        int length = String.valueOf(current).length();

        List<Long> digits = new ArrayList<>();

        for (int power = 1; power <= length; power++) {
            long digit = current % 10;

            current = (long) Math.floor(current / 10);

            digits.add(digit);
        }

        for (int i = digits.size()-1, power = 1; i >= 0; i--, power++) {
            long digit = digits.get(i);
            sum = (long) (sum + (Math.pow(digit, power)));
        }

        return sum;
    }

}