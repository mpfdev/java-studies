
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        
        int greatest = list.get(0);
        
        for (int elem : list) {
            if (elem > greatest) {
                greatest = elem;
            }
        }
        
        System.out.println("The greatest number: " + greatest);
    }
}

