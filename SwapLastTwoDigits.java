import java.util.Scanner;

public class SwapLastTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 10) {
            System.out.println("Number must have at least two digits.");
        } else {
            int lastDigit = num % 10;
            int secondLastDigit = (num / 10) % 10;
            int remainingNumber = num / 100;
            int swappedNumber = remainingNumber * 100 + lastDigit * 10 + secondLastDigit;

            System.out.println("Number after swapping last two digits: " + swappedNumber);
        }
    }
}
