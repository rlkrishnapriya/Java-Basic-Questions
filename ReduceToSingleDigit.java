import java.util.Scanner;

public class ReduceToSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Add last digit
                num /= 10; // Remove last digit
            }
            num = sum; // Update num to the sum
        }

        System.out.println("Reduced single digit: " + num);
    }
}