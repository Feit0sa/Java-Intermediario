public class TesteFibonacci {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();

        for (int i = 0; i <= 5; i++) {
            System.out.println(fibo.calculaFibonacci(i));
        }
    }
}