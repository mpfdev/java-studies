
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        
        while(true) {
            String info = scanner.nextLine();
            
            if(info.isEmpty()) {
                break;
            }
            
            String[] infoArr = info.split(",");
            
            if (Integer.valueOf(infoArr[1]) > age) {
                age = Integer.valueOf(infoArr[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + age);
    }
}

