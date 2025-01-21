import java.util.Scanner;

public class SumLastThreeDigitsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sumLastThreeDigits = (num % 10) + ((num / 10) % 10) + ((num / 100) % 10);
        int reversedSum = 0;
        int originalSum = sumLastThreeDigits;

        while (originalSum > 0) {
            int digit = originalSum % 10;
            reversedSum = reversedSum * 10 + digit;
            originalSum /= 10;
        }

        if (sumLastThreeDigits == reversedSum) {
            System.out.println("The sum of the last three digits is a palindrome.");
        } else {
            System.out.println("The sum of the last three digits is not a palindrome.");
        }
    }
}