import java.util.ArrayList;

public class EX1 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("ala");
        words.add("dog");
        words.add("cat");
        words.add("cat");
        words.add("monkey");
        words.add("mouse");

        System.out.println(getSentenceMostOccuredWord(words));

    }

    public static String getSentenceMostOccuredWord(ArrayList<String> words) {
        int maxCount = 0;
        String wordMostOccured = "";

        for (String word : words) {

            int count = 0;

            for (String word2 : words) {

                if (word.equals(word2)) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    wordMostOccured = word;
                }
            }

        }
        return wordMostOccured;
    }
}



