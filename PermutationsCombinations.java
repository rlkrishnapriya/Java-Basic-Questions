import java.util.Scanner;

public class PermutationsCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of items (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of items to choose (r): ");
        int r = scanner.nextInt();

        // Factorial function to calculate n!
        static long factorial(int num) {
            long result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }

        // Permutations: P(n, r) = n! / (n - r)!
        long permutations = factorial(n) / factorial(n - r);

        // Combinations: C(n, r) = n! / [r! * (n - r)!]
        long combinations = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("Number of permutations (P(n, r)): " + permutations);
        System.out.println("Number of combinations (C(n, r)): " + combinations);
    }
}