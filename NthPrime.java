import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (to find nth prime number): ");
        int n = scanner.nextInt();

        int count = 0, num = 1, prime = 0;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
                prime = num;
            }
        }

        System.out.println("The " + n + "th prime number is: " + prime);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}