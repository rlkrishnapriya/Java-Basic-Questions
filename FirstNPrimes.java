import java.util.Scanner;

public class FirstNPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (number of primes to print): ");
        int n = scanner.nextInt();

        int count = 0, num = 1;
        System.out.println("First " + n + " prime numbers:");
        while (count < n) {
            num++;
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}