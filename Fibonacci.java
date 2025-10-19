import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int f= 0, s= 1;
        System.out.print("Fibonacci Series is: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(f + " ");
            int next = f+ s;
            f = s;
            s = next;
        }
    }
}
