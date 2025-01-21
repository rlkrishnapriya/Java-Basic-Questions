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
        int[] arr = {3, 5, 7, 3, 2, 5, 8, 2, 1};
        int num = 3;
        System.out.println("Occurrence of " + num + ": " + findOccurrence(arr, num));
    }
}