public class Main {
    public static void main(String[] args) {
        System.out.println("------");

        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }

        System.out.println("------");

        Casa novaCasa = new Casa();
        novaCasa.porta1 = new Porta();
        novaCasa.porta2 = new Porta();
        novaCasa.porta3 = new Porta();

        novaCasa.porta1.abre();
        novaCasa.porta2.fecha();

        System.out.println(novaCasa.quantasPortasEstaoAbertas());
    }
}