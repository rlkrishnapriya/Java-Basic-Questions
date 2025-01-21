import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;  // Store the original number
        int reversedNum = 0;    // Variable to store the reversed number

        // Reverse the digits of the number
        while (num > 0) {
            int digit = num % 10;          // Get the last digit
            reversedNum = reversedNum * 10 + digit;  // Build the reversed number
            num = num / 10;                // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        return originalNum == reversedNum;
    }
}