public class Teste {
    public static void main(String[] args) {
        AreaCalculavel[] formasGeometricas = new AreaCalculavel[3];

        formasGeometricas[0] = new Quadrado(3);
        formasGeometricas[1] = new Retangulo(3, 5);
        formasGeometricas[2] = new Circulo(2);

        for (int i = 0; i < formasGeometricas.length; i++) {
            System.out.println(formasGeometricas[i].calculaArea());
        }
    }   
}