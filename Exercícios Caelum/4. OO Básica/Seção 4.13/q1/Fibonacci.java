class Fibonacci {
    int termoAnterior = 0;
    int termo = 1;

    int calculaFibonacci(int num) {
        if (num < 2) {
            return 1;
        } else {
            return calculaFibonacci(num-1) + calculaFibonacci(num-2);
        }
    }
}