package yourOrder;

// Your task is to sort a given string. Each word in the string will contain
// a single number. This number is the position the word should have in the result.
// Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
// If the input string is empty, return an empty string. The words in the input 
// String will only contain valid consecutive numbers.

public class Order {
    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }

    public static String order(String sentence) {

        String[] words = sentence.split(" ");
        String output = "";
        for (int i = 0; i <= words.length; i++) {
            for (String word : words) {
                if (word.contains(String.valueOf(i)))
                    output += word + " ";
            }
        }

        return output.trim();
    }
}
