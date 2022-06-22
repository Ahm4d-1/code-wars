public class Kata {

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17));
    }

    public static int dontGiveMeFive(int start, int end) {
        
        int counter = 0;
        for (int index = start; index <= end; index++) {
            if (!String.valueOf(index).contains("5")) counter++;
        }
        return counter;
    }

}
