import java.util.Scanner;
import java.util.HashMap;

public class DuplicateCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their counts:");
        for (int key : countMap.keySet()) {
            if (countMap.get(key) > 1) {
                System.out.println(key + " appears " + countMap.get(key) + " times");
            }
        }
    }
}