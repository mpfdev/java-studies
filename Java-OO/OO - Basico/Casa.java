public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    void pinta(String s) {
        this.cor = s;
    }

    int quantasPortasEstaoAbertas() {
        int quantidade = 0;
        if (porta1.estaAberta()) {
            quantidade++;
        }

        if(porta2.estaAberta()) {
            quantidade++;
        }

        if(porta3.estaAberta()) {
            quantidade++;
        }

        return quantidade;
    }
}
