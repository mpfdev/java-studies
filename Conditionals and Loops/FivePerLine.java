public class FivePerLine {
    public static void main(String[] args) {
        int initialValue = 1000;
        int finalValue = 2000;

        for(int i = initialValue; i <= finalValue; i++) {
            if (i % 5 == 0)
                System.out.println();

            System.out.print(i + " ");
        }
    }
}

