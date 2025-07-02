import java.util.*;

public class AmoebaMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int a = 0, b = 1, fib = 0;

        if (month == 1) {
            System.out.println(0);
        } else if (month == 2) {
            System.out.println(1);
        } else {
            for (int i = 3; i <= month; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println(fib);
        }
    }
}
