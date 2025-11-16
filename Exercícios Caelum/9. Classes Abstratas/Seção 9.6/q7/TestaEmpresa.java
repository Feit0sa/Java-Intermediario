public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(5);

        for (int i = 0; i < 10; i++) {
            Funcionario f = new Diretor(Integer.toString(i));
            f.setSalario(1000+i*100);
            f.setDataDeEntrada(i*i, i+i, 2000+i);
            empresa.adiciona(f);
        }

        empresa.mostraEmpregados();

        Funcionario carlos = new Diretor();
        carlos.setNome("Carlos");
        carlos.setSalario(2000);
        empresa.adiciona(carlos);

        empresa.getFuncionarios(10).mostra();

        Funcionario andre = new Diretor();

        if (empresa.contem(carlos)) System.out.println("Carlos está na empresa");
        else System.out.println("Carlos não está na empresa");
        
        if (empresa.contem(andre)) System.out.println("André está na empresa");
        else System.out.println("André não está na empresa");

    }
}