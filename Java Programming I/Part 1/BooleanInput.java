
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean isBool = Boolean.valueOf(scanner.nextLine().toLowerCase());
        System.out.println("True or false? " + isBool);

    }
}

