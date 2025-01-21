import java.util.Scanner;

public class CountAgeGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter the ages of 100 people:");
        for (int i = 1; i <= 100; i++) {
            System.out.print("Age " + i + ": ");
            int age = scanner.nextInt();
            if (age >= 50 && age <= 60) {
                count++;
            }
        }

        System.out.println("Number of people in the age group 50–60: " + count);
    }
}