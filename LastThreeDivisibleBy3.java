import java.util.Scanner;

public class LastThreeDivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int lastThreeDigits = num % 1000; // Extract last 3 digits
        if (lastThreeDigits % 3 == 0) {
            System.out.println("The last three digits (" + lastThreeDigits + ") are divisible by 3.");
        } else {
            System.out.println("The last three digits (" + lastThreeDigits + ") are not divisible by 3.");
        }
    }
}