import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        int even = 2;

        for (int i = 1; i <= n; i++) {
            sum += even;
            even += 2; 
        }

        System.out.println("Sum of first " + n + " even numbers = " + sum);
    }
}
