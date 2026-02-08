public abstract class Funcionario {
    protected String nome;
    protected String departamento;
    protected double salario;
    protected Data dataDeEntrada = new Data();
    static protected int identificador = 0;

    Funcionario() {
        Funcionario.identificador += 1;
    }

    Funcionario(String nome) {
        this();
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataDeEntrada(int dia, int mes, int ano) {
        this.dataDeEntrada.dia = dia;
        this.dataDeEntrada.mes = mes;
        this.dataDeEntrada.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getDataDeEntrada() {
        return this.dataDeEntrada.formatada();
    }

    public int getId() {
        return Funcionario.identificador;
    }

    void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    double getGanhoAnual() {
        return this.salario*12;
    }

    public abstract double getBonificacao();

    void mostra() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("ID: " + this.getId());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Data de Entrada: " + this.getDataDeEntrada());
        System.out.println("Ganho: " + this.getGanhoAnual());
        System.out.println("Bonficação: " + this.getBonificacao());
    }
}