package getLengthOfMessingArray;

import java.util.ArrayList;

public class Kata {
    public static void main(String[] args) {
        System.out.println(getLengthOfMissingArray(new Object[][] {}));
    }

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays.length == 0) return 0;
        ArrayList<Integer> lengths = new ArrayList<>();
        for (Object[] objects : arrayOfArrays) {
            if (objects == null || objects.length == 0)
                return 0;
            lengths.add(objects.length);
        }

        int min = 999999;
        for (Integer length : lengths) {
            if (length < min)
                min = length;
        }
        for (int i = min; i <= min + lengths.size(); i++) {
            System.out.format("current index is %d \n", i);
            if (!lengths.contains(i))
                return i;
        }
        return 0;
    }
}