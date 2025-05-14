package Test;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    // Método para verificar si un número es par
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método para calcular el factorial de un número
    public int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
