import java.util.Scanner;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}