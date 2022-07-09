import java.util.Arrays;

public class M2048 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[] { 2, 0, 2, 4 })));
    }

    // Steps:
    // 1. loop through row elements (clean zeroes)
    // 2. shift all values after zero by 1 for each zero
    // 3. loop through the new cleaned array
    // 4. if two consecutive numbers are the same, put their sum in the earlier
    // index
    // 5. repeat steps 1 to 4 until no consecutive numbers are equal
    static int[] merge(int[] line) {

        Boolean isMergeable = true;

        while (isMergeable) {
            line = cleanRow(line);
            int[] temp = Arrays.copyOf(line, line.length);
            line = mergeConsectives(line);
            if (Arrays.equals(line, temp))
                isMergeable = false;
        }

        return line;
    }

    private static int[] mergeConsectives(int[] line) {

        for (int i = 0; i < line.length; i++) {
            try {
                if (line[i] == line[i + 1]) {
                    line[i] = line[i] + line[i + 1];
                    line[i + 1] = 0;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        return line;
    }

    private static int[] cleanRow(int[] line) {

        Boolean zeroExists = false;
        for (int i = 0; i < line.length; i++) {
            if (line[i] == 0) {
                zeroExists = true;
                continue;
            }
            if (zeroExists) {
                // System.out.println("Before Shifting to Left = " + Arrays.toString(line));
                for (int j = i; j < line.length; j++) {
                    line[j - 1] = line[j];
                }
                line[line.length-1] = 0;
                // System.out.println("After Shifting to Left = " + Arrays.toString(line));
                zeroExists = false;
            }
        }

        return line;
    }

}
