import java.util.Scanner;

public class PermutationsCombinations {
    // Factorial function to calculate n!
    public static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of items (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of items to choose (r): ");
        int r = scanner.nextInt();

        // Validate inputs
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input! Ensure that 0 <= r <= n.");
        } else {
            // Permutations: P(n, r) = n! / (n - r)!
            long permutations = factorial(n) / factorial(n - r);

            // Combinations: C(n, r) = n! / [r! * (n - r)!]
            long combinations = factorial(n) / (factorial(r) * factorial(n - r));

            System.out.println("Number of permutations (P(n, r)): " + permutations);
            System.out.println("Number of combinations (C(n, r)): " + combinations);
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}