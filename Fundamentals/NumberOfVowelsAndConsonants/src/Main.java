import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter new text:");
        String text = sc.nextLine().toLowerCase();

        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                numberOfVowels += 1;
            } else {
                numberOfConsonants += 1;
            }
        }

        System.out.println("Number of vowels: " + numberOfVowels);
        System.out.println("Number of consonants: " + numberOfConsonants);
    }
}