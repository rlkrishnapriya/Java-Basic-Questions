import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Integer[] array = new Integer[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Array in descending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}