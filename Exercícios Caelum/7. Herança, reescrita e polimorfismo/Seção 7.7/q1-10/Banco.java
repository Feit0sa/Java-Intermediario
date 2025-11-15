public class Banco {
    Conta[] contas;

    Banco(int numeroDeContas) {
        contas = new Conta[numeroDeContas];
    }

    public void adiciona(Conta c) {
        if (primeiraPosicaoLivre(contas) != -1) {
            this.contas[primeiraPosicaoLivre(contas)] = c;
        } else {
            Conta[] contas = new Conta[this.contas.length+10];
            for (int i = 0; i < this.contas.length; i++) {
                contas[i] = this.contas[i];
            }
            this.contas = contas;
            this.contas[primeiraPosicaoLivre(contas)] = c;
        }
    }

    private int primeiraPosicaoLivre(Conta[] c) {
        int i = 0;
        while (i < c.length) {
            if (c[i] == null) return i;
            i++;
        }
        return -1;
    }

    public Conta getConta(int x) {
        return this.contas[x];
    }

    public int getTotalDeContas() {
        return primeiraPosicaoLivre(this.contas);
    }
}