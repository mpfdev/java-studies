public class Fibonacci {

    int calculaFibonacci(int number) {
        return number == 1 || number == 2 ? 1 : calculaFibonacci(number - 1) + calculaFibonacci(number - 2);
    }
}
