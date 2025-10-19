import java.util.Scanner;
public class GenPrime  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + ": ");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(num + " ");
        }
    }
}
