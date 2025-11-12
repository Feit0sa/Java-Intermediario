public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Danilo";
        f1.departamento = "SAC";
        f1.salario = 100;
        f1.dataDeEntrada = new Data();
        f1.dataDeEntrada.dia = 14;
        f1.dataDeEntrada.mes = 04;
        f1.dataDeEntrada.ano = 2014;

        f1.mostra();
        
    }
}
