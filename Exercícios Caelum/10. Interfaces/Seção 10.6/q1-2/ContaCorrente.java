public class ContaCorrente implements ContaTributavel {
    private double saldo;

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}