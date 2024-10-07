import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class Q4 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        // Leitura da entrada que é o valor de n
        int n = parseInt(br.readLine().trim());

        // Chamar a função recursiva e obter o enésimo número de Fibonacci
        int resultRecursive = fibonacciRecursive(n);

        // Chamar a função iterativa e obter o enésimo número de Fibonacci
        int resultIterative = fibonacciIterative(n);

        // Imprimir os resultados
        System.out.println("Fibonacci Recursivo: " + resultRecursive);
        System.out.println("Fibonacci Iterativo: " + resultIterative);
    }

    // Função recursiva para calcular Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1; // Caso base F(1) = 1
        else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    // Função iterativa para calcular Fibonacci
    public static int fibonacciIterative(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;


        int prev1 = 0, prev2 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}
