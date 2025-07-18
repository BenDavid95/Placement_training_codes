import java.util.Scanner;

public class PowerCalculator {

    public static long power(int a, int n) {
        if (n == 0) {
            return 1; 
        }
        return a * power(a, n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        long result = power(a, n);

        System.out.println("The value of " + a + " power " + n + " is " + result);

        scanner.close();
    }
}
