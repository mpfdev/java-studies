import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by space: ");
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");

        //Creates a new Stack
        Stack<Integer> intStack = new Stack<Integer>();

        //Push Elements to the Stack
        for(String inpt : inputArr) {
            intStack.push(Integer.parseInt(inpt));
        }
        System.out.println();
        //Show all elements of the Stack
        for (Integer i : intStack) {
            System.out.print(i + " ");
        }

        //Peak at the top element of the stack
        int top = intStack.peek();
        System.out.println("Top element: " + top);

        //Pop elements off the stack
        int popped = intStack.pop();
        System.out.println("Popped element: " + popped);

        //Show all elements of the Stack
        for (Integer i : intStack) {
            System.out.print(i + " ");
        }
    }
}