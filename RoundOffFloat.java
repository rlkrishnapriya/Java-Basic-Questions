import java.util.Scanner;

public class RoundOffFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        float num = scanner.nextFloat();

        // Round off to the nearest integer
        int roundedValue = Math.round(num);
        System.out.println("Rounded value: " + roundedValue);
    }
}