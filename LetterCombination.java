import java.util.*;

class KeypadCombinations {

    private static final String[] KEYPAD = {
        "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" 
    };

    public void generateCombinations(String digits, String current, int index, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        char digitChar = digits.charAt(index);
        int digit = digitChar - '0';
        String letters = KEYPAD[digit];

        for (char c : letters.toCharArray()) {
            generateCombinations(digits, current + c, index + 1, result);
        }
    }
}

class LetterCombination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (digits 2-9): ");
        String input = scanner.nextLine();

        KeypadCombinations generator = new KeypadCombinations();
        List<String> result = new ArrayList<>();

        if (!input.matches("[2-9]+")) {
            System.out.println("Invalid input! Only digits 2-9 are allowed.");
            return;
        }
        generator.generateCombinations(input, "", 0, result);

        System.out.print("Possible letter combinations:");
        for (String combination : result) {
            System.out.print(combination+", ");
        }
    }
}

