package twoSum;

public class Solution {

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1, 2, 3}, 4));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
