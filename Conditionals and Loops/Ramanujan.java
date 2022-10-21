import java.util.Arrays;

public class Ramanujan {
    public static void main(String[] args) {

        //read in one cli
        int n = Integer.parseInt(args[0]);

        //for each a, b, c, d, check a³ + b³ = c³ + d³
        for(int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n)
                break;

            //b nesting
            for (int b = a; b <= n; b++) {
                int b3 = b * b * b;
                if (a3 + b3 > n)
                    break;

                //c nesting
                for (int c = a + 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > a3 + b3)
                        break;

                    //d nesting
                    for (int d = c; d <= n; d++) {
                        int d3 = d * d * d;
                        if (c3 + d3 > a3 + b3)
                            break;

                        if(a3 + b3 == c3 + d3) {
                            System.out.print((a3+b3) + " =");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }

        }
    }
}

