import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] revString = new char[input.length()];

        int j = input.length();
        for(int i = 0; i < revString.length; i++) {
            revString[i] = input.charAt(j-1);
            j -= 1;
        }

        for (char c : revString) {
            System.out.print(c + "");
        }
    }
}