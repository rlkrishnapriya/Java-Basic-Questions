import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        scanner.close();
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}