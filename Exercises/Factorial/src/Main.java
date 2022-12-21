import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = Integer.parseInt(sc.nextLine());
        int output = factorial(input);

        System.out.print("Input: " + input + "!");
        System.out.println();
        System.out.print("Output: " + output);
    }

    public static int factorial(int input) {
        if (input == 1) {
            return 1;
        }
        return input * factorial(input - 1);
    }
}