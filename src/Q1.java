import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the first integer (s1)
        int s1 = Integer.parseInt(br.readLine().trim());

        // Read the second integer (s2)
        int s2 = Integer.parseInt(br.readLine().trim());

        // Initial sequence and differences
        int[] baseSequence = {89, 119, 97, 128, 105, 137, 149, 121};
        int[] differences = {30, -22, 31, -23, 32, 12, -28};

        // Start from the first element
        int currentValue = baseSequence[0];
        int diffIndex = -1; // Start at -1 to align with the sequence pattern
        int count = 0;

        // Check the initial value
        if (currentValue >= s1 && currentValue <= s2) {
            count++;
        }

        while (true) {
            // Update diffIndex before using it
            diffIndex = (diffIndex + 1) % differences.length;

            // Update currentValue
            currentValue += differences[diffIndex];

            // Break if currentValue exceeds s2
            if (currentValue > s2) {
                break;
            }

            // Count if currentValue is within the range
            if (currentValue >= s1) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
    }
}
