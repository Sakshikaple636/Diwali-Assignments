import java.util.Scanner;

 public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (distinct numbers from 0 to n):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }

        int missingNumber = totalSum - arrSum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
