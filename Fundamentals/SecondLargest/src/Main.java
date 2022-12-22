import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Input a list of numbers");
        while (true) {
            System.out.print("Number: ");
            int number = Integer.parseInt(sc.nextLine());

            if (number == 0) {
                break;
            }

            list.add(number);
        }

        Collections.sort(list);

        System.out.println("The second largest element is: " + list.get(list.size() - 2));
    }
}