public class PessoaFisica {
    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    // Livro disse que não precisava escrever o algoritmo de validação, só passar o cpf pelo método
    public void validaCpf(String cpf) {
        if (this.cpf == cpf) System.out.println("CPF válido");
        else System.out.println("CPF inválido");
    }
}