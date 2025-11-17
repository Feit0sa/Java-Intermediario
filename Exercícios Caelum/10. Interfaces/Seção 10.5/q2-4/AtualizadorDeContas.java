public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("Saldo antigo: " + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo novo: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }
}