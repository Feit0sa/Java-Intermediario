public class Testes {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa();

        minhaCasa.porta[0].aberta = false;
        minhaCasa.porta[1].aberta = true;
        minhaCasa.porta[2].aberta = true;

        System.out.println(minhaCasa.quantasPortasEstaoAbertas() + "portas estão abertas.");
    }
}
