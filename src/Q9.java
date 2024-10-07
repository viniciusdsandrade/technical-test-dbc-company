import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class Q9 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // Ler a entrada (números separados por vírgula)
        String input_from_question = br.readLine();

        // Quebrar a entrada em um array de strings usando a vírgula como separador
        String[] numbers = input_from_question.split(",");

        // Usar dois conjuntos (HashSet) para rastrear números vistos e repetidos
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();

        // Percorrer os números e preencher os conjuntos
        for (String num : numbers) {
            int number = parseInt(num.trim());
            if (seen.contains(number)) {
                // Se o número já foi visto, adiciona ao conjunto de repetidos
                repeated.add(number);
            } else {
                // Caso contrário, adiciona ao conjunto de vistos
                seen.add(number);
            }
        }

        // Imprimir a quantidade de números repetidos
        System.out.println(repeated.size());
    }
}
