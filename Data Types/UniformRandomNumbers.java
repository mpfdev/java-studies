public class UniformRandomNumbers {
    public static void main(String[] args) {

        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        double average = (x1 + x2 + x3 + x4 + x5) / 5;
        double min = Math.min(x1,Math.min(x2,Math.min(x3,Math.min(x4,x5))));
        double max = Math.max(x1,Math.max(x2,Math.max(x3,Math.max(x4,x5))));

        System.out.println("Average: " + average);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    }
}

