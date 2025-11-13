public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(5);

        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.nome = Integer.toString(i);
            f.salario = 1000 + i*100;
            empresa.adiciona(f);
        }

        empresa.mostraEmpregados();

        Funcionario carlos = new Funcionario();
        carlos.nome = "Carlos";
        carlos.salario = 2000;
        empresa.adiciona(carlos);

        empresa.empregados[10].mostra();

        Funcionario andre = new Funcionario();

        if (empresa.contem(carlos)) System.out.println("Carlos está na empresa");
        else System.out.println("Carlos não está na empresa");
        
        if (empresa.contem(andre)) System.out.println("André está na empresa");
        else System.out.println("André não está na empresa");

    }   
}