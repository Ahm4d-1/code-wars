public class SpinWords {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }

    /* 
     * Steps:
     * 1. split the sentence into words
     * 2. loop over all words and do:
     *  3. if word length >= 5, reverse the word and append it to new string
     *  4. if not, just append the word to new sentence
     */

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String newSentence = "";

        for (String word : words) {
            System.out.println(word);
            if (word.length() >= 5) {
                int wordLen = word.length();
                char[] charArray = word.toCharArray();
                char[] tempCharArray = new char[wordLen];
                for (int i = 0; i < wordLen; i++) {
                    tempCharArray[i] = charArray[wordLen - i - 1];
                }
                word = new String(tempCharArray);
            } 

            newSentence += " " + word;
        }

        return newSentence.trim();
    }
}