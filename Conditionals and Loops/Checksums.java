public class Checksums {
    public static void main(String[] args) {
        int digits = Integer.parseInt(args[0]);
        int value = 0;

        if(args[0].length() != 9) {
            System.out.println("Invalid number of digits");
            System.exit(0);
        }

        for (int i = 2; i <= 10; i++) {
            int digit = digits % 10;
            value += i * digit;
            digits = digit / 10;
        }

        if (value % 11 == 1)
            System.out.println("Checksum: 10");
        else if (value % 11 == 0)
            System.out.println("Checksum: 0");
        else
            System.out.println("Checksum: " + (11 - (value % 11)));
    }
}

