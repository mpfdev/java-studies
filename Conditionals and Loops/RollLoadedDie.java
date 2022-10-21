public class RollLoadedDie {
    public static void main(String[] args) {
        double probability = Math.random();

        if(probability <= 1.0 / 8)
            System.out.println("Dice: 1");
        else if(probability <= 2.0 / 8)
            System.out.println("Dice: 2");
        else if(probability <= 3.0 / 8)
            System.out.println("Dice: 3");
        else if(probability <= 4.0 / 8)
            System.out.println("Dice: 4");
        else if(probability <= 5.0 / 8)
            System.out.println("Dice: 5");
        else
            System.out.println("Dice: 6");
    }
}

