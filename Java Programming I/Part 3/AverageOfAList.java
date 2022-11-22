
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            }
            
            list.add(num);
        }
        
        int sum = 0;
        int count = list.size();
        
        for (int num : list) {
            sum += num;
        }
        
        double average = (double) sum / count;
        
        System.out.println("Average: " + average);
        
    }
}

