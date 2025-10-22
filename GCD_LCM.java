import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    
    static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return findGCD(b, a % b);
    }
}
