
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            
            if (text.isEmpty()) {
                break;
            }
            
            String[] textArr = text.split(" ");
            
            System.out.println(textArr[textArr.length - 1]);
        }

    }
}

