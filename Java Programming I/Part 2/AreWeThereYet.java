
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        
        int number = Integer.valueOf(scanner.nextLine());
        
        while(number != 4) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
        }
    }
}

