
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double number = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean isBool = Boolean.valueOf(scan.nextLine().toLowerCase());
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + number);
        System.out.println("You gave the boolean " + isBool);

    }
}

