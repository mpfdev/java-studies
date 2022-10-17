import java.time.LocalDate;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    LocalDate data_de_abertura = LocalDate.now();

    void sacar(double valor) {
        double novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }

    void depositar(double valor) {
        double novoSaldo = this.saldo = valor;
        this.saldo = novoSaldo;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", data_de_abertura=" + data_de_abertura.getDayOfMonth() + "/" + data_de_abertura.getMonth() + "/" + data_de_abertura.getYear() +
                '}';
    }
}
