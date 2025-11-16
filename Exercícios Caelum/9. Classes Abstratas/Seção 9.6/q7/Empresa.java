public class Empresa {
    private String cnpj;
    private Funcionario[] empregados;

    Empresa(int num) {
        empregados = new Funcionario[num];
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public Funcionario getFuncionarios(int i) {
        return this.empregados[i];
    }

    public void adiciona(Funcionario f) { // setEmpregados
        if (primeiraPosicaoLivre(empregados) != -1) {
            this.empregados[primeiraPosicaoLivre(empregados)] = f;
        } else {
            Funcionario[] empregados = new Funcionario[this.empregados.length*2];
            for (int i = 0; i < this.empregados.length; i++) {
                empregados[i] = this.empregados[i];
            }
            this.empregados = empregados;
            this.empregados[primeiraPosicaoLivre(empregados)] = f;
        }
    }

    private int primeiraPosicaoLivre(Funcionario[] f) {
        int i = 0;
        while (i < f.length) {
            if (f[i] == null) return i;
            i++;
        }
        return -1;
    }

    public void mostraEmpregados() {
        for (int i = 0; i < empregados.length; i++) {
            System.out.printf("Funcionário na posição %d: \n", i+1);
            empregados[i].mostra();
            System.out.println("");
        }
    }

    public boolean contem(Funcionario f) {
        int i = 0;
        while(i < empregados.length) {
            if (f == empregados[i]) return true;
            i++;
        }
        return false;
    }
}