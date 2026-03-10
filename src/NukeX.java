public class EX5 {
    public static void main(String[] args) {

        String sentence = "axlaxxxmxaxkxoxtxax";

        String ans = removeXs(sentence);
        System.out.println(ans);

    }

    public static String removeXs(String sentence) {
        String nukeX = "";

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) != 'x') {
                nukeX = nukeX + sentence.charAt(i);
            }

        } return nukeX;
    }
}