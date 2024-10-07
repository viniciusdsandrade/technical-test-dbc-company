import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class Q3 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // Leitura do tamanho do array
        int n = parseInt(br.readLine().trim());

        // Leitura do array de números
        String[] arrayInput = br.readLine().split(",");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = parseInt(arrayInput[i].trim());
        }

        // Leitura do valor de k (número de rotações)
        int k = parseInt(br.readLine().trim());

        // Chamada da função para rotacionar o array
        int[] resultado = rotacionarArray(array, k);

        // Exibir o array rotacionado
        System.out.println(Arrays.toString(resultado).replaceAll("[\\[\\] ]", ""));
    }

    // Função para rotacionar o array à direita por k passos
    public static int[] rotacionarArray(int[] array, int k) {
        int n = array.length;

        // Ajustar k para evitar rotações desnecessárias
        k = k % n;

        // Criar um novo array para o resultado rotacionado
        int[] rotatedArray = new int[n];

        // Preencher o array rotacionado
        for (int i = 0; i < n; i++) rotatedArray[(i + k) % n] = array[i];

        return rotatedArray;
    }
}
