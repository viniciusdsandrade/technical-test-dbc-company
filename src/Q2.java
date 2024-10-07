import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;
import static java.util.Arrays.sort;

public class Q2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // Read the input from the question
        String input_from_question = br.readLine();

        // Split the input to get the two words
        String[] words = input_from_question.split(",");

        String word1 = words[0].trim(); // First word
        String word2 = words[1].trim(); // Second word

        // Check if they have the same length and are not the same word
        if (word1.length() != word2.length() || word1.equals(word2)) {
            System.out.println("false");
            return;
        }

        // Convert both words to char arrays and sort them
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        sort(charArray1);
        sort(charArray2);

        // Compare the sorted char arrays
        System.out.println(Arrays.equals(charArray1, charArray2) ? "true" : "false");
    }
}
