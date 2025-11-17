public class Circulo implements AreaCalculavel {
    private int raio;

    Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}