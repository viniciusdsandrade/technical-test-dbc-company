import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class Q8 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // Ler a primeira e a segunda string (os dois limites do intervalo)
        String s1 = br.readLine().trim();
        String s2 = br.readLine().trim();

        // Converter as strings para inteiros
        int start = parseInt(s1);
        int end = parseInt(s2);

        // Contador para os números palíndromos
        int palindromeCount = 0;

        // Iterar pelos números no intervalo inclusivo [start, end]
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                palindromeCount++;
            }
        }

        // Imprimir a quantidade de palíndromos
        System.out.println(palindromeCount);
    }

    // Função para verificar se um número é palíndromo
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
