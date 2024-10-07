import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Q7 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // Leitura da entrada
        String frequencia = br.readLine().trim();

        // Contagem de faltas e atrasos
        int faltas = contarOcorrencias(frequencia, 'F');
        int atrasos = contarOcorrencias(frequencia, 'A');

        // Verificação dos critérios e exibição do resultado
        System.out.println(faltas <= 2 && atrasos <= 4 ? "parabens" : "atencao");
    }

    // Função para contar as ocorrências de um caractere específico em uma string
    private static int contarOcorrencias(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
