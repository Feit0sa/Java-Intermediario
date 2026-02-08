class Porta {
    boolean aberta;
    String cor;
    int dimensaoX, dimensaoY, dimensaoZ;

    void abre() {
        aberta = true;
    }

    void fecha() {
        aberta = false;
    }

    void pinta(String s) {
        cor = s;
    }

    boolean estaAberta() {
        if (aberta) {
            return true;
        } else {
            return false;
        }
    }
}