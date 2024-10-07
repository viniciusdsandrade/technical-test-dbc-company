import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Leitura da primeira string
        String s1 = br.readLine().trim();

        // Leitura da segunda string
        String s2 = br.readLine().trim();

        // Chamar a função para calcular a distância de edição
        int result = editDistance(s1, s2);

        // Imprimir o resultado
        System.out.println(result);
    }

    // Função para calcular a distância de edição com custo de substituição 2
    public static int editDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Criar uma matriz dp de tamanho (m+1) x (n+1)
        int[][] dp = new int[m + 1][n + 1];

        // Inicializar a matriz
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    // Se s1 está vazio, o custo é inserir todos os caracteres de s2
                    dp[i][j] = j * 1; // Custo de inserção é 1
                } else if (j == 0) {
                    // Se s2 está vazio, o custo é remover todos os caracteres de s1
                    dp[i][j] = i * 1; // Custo de remoção é 1
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    // Se os caracteres são iguais, não há custo adicional
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Se os caracteres são diferentes, consideramos:
                    // Substituição (custo 2), Inserção (custo 1), Remoção (custo 1)
                    dp[i][j] = Math.min(
                            dp[i - 1][j - 1] + 2, // Substituir com custo 2
                            Math.min(
                                    dp[i - 1][j] + 1,  // Remover com custo 1
                                    dp[i][j - 1] + 1   // Inserir com custo 1
                            )
                    );
                }
            }
        }

        // Retornar o valor final da matriz dp, que é a distância de edição
        return dp[m][n];
    }
}
