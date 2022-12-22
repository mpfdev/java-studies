import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by space: ");
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int[] numbers = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }

        Arrays.sort(numbers);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / (double) numbers.length;

        int median = (numbers.length + 1) / 2;



        int mode = numbers[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == mode) {
                currentCount += 1;
            } else if (currentCount > maxCount) {
                mode = numbers[i];
                maxCount = currentCount;
                currentCount = 1;
            } else {
                currentCount = 1;
            }
        }

        System.out.println("Sorted array:");
        for(int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Median: " + numbers[median]);
        System.out.println("Mode: " + mode);
    }
}