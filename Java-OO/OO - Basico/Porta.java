public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;

    void abre() {
        if(aberta == false) {
            this.aberta = true;
        }
    }

    void fecha() {
        if(aberta == true) {
            this.aberta = false;
        }
    }

    void pinta(String s) {
        this.cor = s;
    }

    boolean estaAberta() {
        if(aberta == true) {
            return true;
        } else {
            return false;
        }
    }
}
