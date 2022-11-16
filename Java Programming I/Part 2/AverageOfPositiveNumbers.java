
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int positiveSum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                positiveCount += 1;
                positiveSum += number;
            }
        }
        
        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
            System.exit(0);
        }
        
        double positiveAverage = positiveSum / (double) positiveCount;
        
        System.out.println(positiveAverage);
    }
}

