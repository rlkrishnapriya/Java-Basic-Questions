import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();

        if (sellingPrice > costPrice) {
            System.out.println("Profit: " + (sellingPrice - costPrice));
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss: " + (costPrice - sellingPrice));
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}