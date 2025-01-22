import java.util.Scanner;

public class FindOccurrence {
    public static int findOccurrence(int[] arr, int num) {
        int count = 0;
        for (int n : arr) {
            if (n == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number to find its occurrence:");
        int num = scanner.nextInt();

        System.out.println("Occurrence of " + num + ": " + findOccurrence(arr, num));

        scanner.close();
    }
}