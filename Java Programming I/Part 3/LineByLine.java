
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        while(true) {
            String text = scanner.nextLine();
            String[] stringArray = text.split(" ");
            
            if (text.isEmpty()) {
                break;
            }
            
            for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
            
            }
            
        }
        
        
    }
}

