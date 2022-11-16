
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shall we carry on?");
        
        String text = scanner.nextLine();
        
        while(!text.equals("no")) {
            System.out.println("Shall we carry on?");
            text = scanner.nextLine();
        }
    }
}

