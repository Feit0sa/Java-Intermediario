public class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data dataDeEntrada;

    void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    double calculaGanhoAnual() {
        return this.salario*12;
    }

    void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Entrada: " + dataDeEntrada.dia + "/" + dataDeEntrada.mes + "/" + dataDeEntrada.ano);
        System.out.println("Ganho: " + calculaGanhoAnual());
    }
}