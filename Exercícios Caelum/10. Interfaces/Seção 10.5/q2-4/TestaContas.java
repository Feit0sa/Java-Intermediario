public class TestaContas {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.deposita(1000);
        cp.deposita(1000);

        // c.atualiza(0.01);
        // cc.atualiza(0.01);
        // cp.atualiza(0.01);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo total: " + adc.getSaldoTotal());
        System.out.printf("\n\n\n");

        Banco banco = new Banco(10);

        for (int i = 0; i < 12; i++) {
            Conta c1 = new ContaCorrente();
            c1.deposita(1000*i);
            Conta c2 = new ContaPoupanca();
            c2.deposita(500*i);
            banco.adiciona(c1);
            banco.adiciona(c2);
        }

        
        for (int i = 0; i < banco.getTotalDeContas(); i++) {
            System.out.println(banco.getConta(i));
            adc.roda(banco.contas[i]);
            System.out.println("");
        }

        if (banco.getTotalDeContas() != -1) System.out.println("Número de contas: " + banco.getTotalDeContas());
        else System.out.println("Número de contas: " + banco.contas.length);

    }
}