public class TestePessoaFisica {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();

        pf.setCpf("123.456.789.00");
        pf.validaCpf("123.456.789.01");
    }
}