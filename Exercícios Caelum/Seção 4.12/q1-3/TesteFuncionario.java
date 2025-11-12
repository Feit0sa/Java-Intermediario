public class TesteFuncionario {
    public static void main(String[] args) {
        FuncionarioQ f1 = new FuncionarioQ();

        f1.nome = "Davi";
        f1.salario = 100;
        f1.departamento = "SAC";
        f1.dataDeEntrada = "14/05/2014";
        f1.recebeAumento(50);

        f1.mostra();
    }
}
