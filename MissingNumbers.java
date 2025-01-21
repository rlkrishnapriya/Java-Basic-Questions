import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the array (1 to " + n + "):");
        int[] arr = new int[n - 1];
        boolean[] isPresent = new boolean[n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            isPresent[arr[i]] = true;
        }

        System.out.println("Missing numbers:");
        for (int i = 1; i <= n; i++) {
            if (!isPresent[i]) {
                System.out.print(i + " ");
            }
        }
    }
}