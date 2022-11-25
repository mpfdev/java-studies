
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int age = 0;

        while(true) {
            String info = scanner.nextLine();
            
            if (info.isEmpty()) {
                break;
            }
            
            String[] infoArr = info.split(",");
            
            int ageInt = Integer.valueOf(infoArr[1]);
            
            if(ageInt > age) {
                age = ageInt;
                name = infoArr[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);

    }
}

