
import java.util.Scanner;



public class FromParameterToOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int from = Integer.valueOf(sc.nextLine());
        
        printFromNumberToOne(from);
        
        
    }
    
    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }

}

