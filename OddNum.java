import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1, count = 0; count < n; i += 2) {
            sum += i;
            count++;
        }

        System.out.println("Sum of first " + n + " odd numbers = " + sum);
    }
}
