
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int text = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + text);
    }
}

