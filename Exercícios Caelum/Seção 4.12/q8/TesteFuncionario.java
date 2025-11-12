public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.dataDeEntrada = new Data();

        // Funcionario.salario = 1234;
        // Funcionario.calculaGanhoAnual();
        /* Ambos não funcionam por que tanto os atributos quanto os métodos da classe Funcionario não são static, ficando a depender da criação de um objeto */

        f1.mostra();
        
    }
}
