public class FunctionGrowth {
    public static void main(String[] args) {

        System.out.println("nln \t n \t nln \t n2 \t n3");
        for (int i = 2; i <= 2048; i *= 2) {
            double ln = Math.log(i);
            double n = i;
            double nln = i * Math.log(i);
            double n2 = Math.pow(i,2);
            double n3 = Math.pow(i,3);

            System.out.println(ln + " \t " + n + "\t" + nln + "\t" + n2 + "\t" + n3);

        }
    }
}

