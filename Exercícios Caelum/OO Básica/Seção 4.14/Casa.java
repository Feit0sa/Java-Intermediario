public class Casa {
    String cor;
    Porta porta[] = new Porta[3];

    // Construtor, estudar mais a frente
    Casa() {
        for (int i = 0; i < porta.length; i++) {
            porta[i] = new Porta();
        }
    }


    void pinta(String s) {
        cor = s;
    }

    int quantasPortasEstaoAbertas() {
        int count = 0;
        for (Porta portas : porta) {
            if (portas.estaAberta()) count++;
        }
        return count;
    }
}