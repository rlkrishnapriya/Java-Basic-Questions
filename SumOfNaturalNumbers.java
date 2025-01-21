import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2; // Using the formula
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }
}