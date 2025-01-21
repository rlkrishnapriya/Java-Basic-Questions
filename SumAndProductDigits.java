import java.util.Scanner;

public class SumAndProductDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int firstDigit = 0, lastDigit = num % 10, product = 1, temp = num;

        while (temp > 0) {
            if (temp / 10 == 0) {
                firstDigit = temp;
            } else {
                product *= temp % 10;
            }
            temp /= 10;
        }

        System.out.println("Sum of first and last digits: " + (firstDigit + lastDigit));
        System.out.println("Product of middle digits: " + product);
    }
}