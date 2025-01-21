import java.util.Scanner;

public class InterchangeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String numStr = Integer.toString(num);
        String result = "";

        // Interchange digits
        for (int i = numStr.length() - 1; i >= 0; i--) {
            result += numStr.charAt(i);
        }

        System.out.println("Number after interchanging: " + result);
    }
}