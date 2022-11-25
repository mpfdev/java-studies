
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        while (true) {
            String text = scanner.nextLine();
            String[] strArr = text.split(" ");
            
            if (text.isEmpty()) {
                break;
            }
            
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].contains("av")) {
                    System.out.println(strArr[i]);
                }
            }
        }
        
        
    }
}

