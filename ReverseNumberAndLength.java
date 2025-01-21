import java.util.Scanner;

public class ReverseNumberAndLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reversed = 0, length = 0, temp = num;

        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
            length++;
        }

        System.out.println("Reversed number: " + reversed);
        System.out.println("Length of the number: " + length);
    }
}