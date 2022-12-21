import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a list of strings separated by spaces: ");
        String input = sc.nextLine();

        String[] strArr = input.split(" ");

        int longestString = strArr[0].length();
        int indexLongestString = 0;

        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].length() > longestString) {
                longestString = strArr[i].length();
                indexLongestString = i;
            }
        }

        System.out.println("List of strings: ");
        for (String str : strArr) {
            System.out.print(str + " ");
        }

        System.out.println();
        System.out.println("Longest String: " + strArr[indexLongestString]);
    }
}