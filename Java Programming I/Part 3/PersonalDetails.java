
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int nameLength = 0;
        int count = 0;
        double averageBirth = 0.0;
        
        while(true) {
            String info = scanner.nextLine();
            
            if (info.isEmpty()) {
                break;
            }
            
            String[] infoArr = info.split(",");
            
            String infoName = infoArr[0];
            
            if (infoName.length() > nameLength) {
                nameLength = infoName.length();
                name = infoArr[0];
            }
            
            averageBirth += Double.valueOf(infoArr[1]);
            count += 1;
        }
        
        averageBirth /= count;
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + averageBirth);
    }
}

