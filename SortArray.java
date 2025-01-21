import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}