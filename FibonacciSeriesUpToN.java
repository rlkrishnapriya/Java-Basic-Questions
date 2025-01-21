import java.util.Scanner;

public class FibonacciSeriesUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + n + ":");
        while (a <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}