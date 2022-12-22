import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();

        System.out.print("Enter a list of strings separated by spaces: ");
        String input = sc.nextLine();
        String[] strInput = input.split(" ");

        for(String str : strInput) {
            if(!strList.contains(str)) {
                strList.add(str);
            }
        }

        System.out.println("Removed Duplicated List:");
        for(String str : strList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}