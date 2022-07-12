import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(new int[] { 1, 1, 2 }));
    }
    /*
     * Problem:
     * Given an array of integers, find the one that appears an odd number of times.
     * 
     * There will always be only one integer that appears an odd number of times.
     */

    /*
     * Solution:
     * 1. create a map that will hold the integer and its count, for every integer
     * 2. loop through all integers, add them to the counting maps
     * 3. loop through the counting maps, and return the key where the its value is
     * odd
     */
    public static int findIt(int[] a) {
        Map<Integer,Integer> counts = new HashMap<>();

        for (int number : a) {
            if (counts.containsKey(number)) {
                int count = counts.remove(number);
                // System.out.println("popped count = " + count);
                counts.put(number, ++count);
                // System.out.println("getting value = " + counts.get(number));
            }
            else {
                counts.put(number, 1);
            }
        }

        int[] odd = new int[1];
        counts.forEach((key,value) -> {
            // System.out.println("key = " + key + " ,value = " + value) ;
            if (value % 2 != 0) {
                odd[0] = key;
                return;
            }
        });
        return odd[0];
    }
}
