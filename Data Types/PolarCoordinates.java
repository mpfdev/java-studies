public class PolarCoordinates {
    public static void main(String[] args) {
        /**
         * Cartesian to Polar Coordinates
         * r = sqrt (x² + y²)
         * theta = tan⁻¹ * (y/x)
         */

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double theta = Math.atan2(y,x);

        System.out.println("X: " + x + " | Y: " + y);
        System.out.println("R: " + r);
        System.out.println("theta: " + theta);
    }
}

