import java.util.*;

class WordProcessor {

    public String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove Punctuations
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}

class LongestWord{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();

        WordProcessor w = new WordProcessor();
        String word = w.findLongestWord(sentence);

        System.out.print("Longest Word: " + word);
    }
}
