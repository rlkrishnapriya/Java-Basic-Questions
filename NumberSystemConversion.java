import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Decimal to Hexadecimal
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());

        // Hexadecimal to Octal
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();
        decimal = Integer.parseInt(hex, 16);
        System.out.println("Octal: " + Integer.toOctalString(decimal));

        // Octal to Binary
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        decimal = Integer.parseInt(octal, 8);
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
    }
}