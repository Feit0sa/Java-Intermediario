public class Diretor extends Funcionario {
    

    Diretor() {
        Diretor.identificador += 1;
    }

    Diretor(String nome) {
        this();
        this.nome = nome;
    }

    @Override
    public double getBonificacao() {
        return this.salario * 1.2;
    }

}