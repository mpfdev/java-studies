import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.print("Enter a list of Strings separated by spaces: ");
        String input = sc.nextLine();
        String[] textList = input.split(" ");

        for(int i = 0; i < textList.length; i++) {
            list.add(textList[i]);
        }

        Collections.sort(list);

        System.out.println("Sorted list");
        System.out.println(list);
    }
}