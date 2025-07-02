import java.util.*;

public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); 
        int e = sc.nextInt(); 

        for (int i = s; i <= e; i++) {
            int n = i;
            int sm = 0;
            int p = 1;

            while (n > 0) {
                int digit = n % 10;
                sm += digit;
                p *= digit;
                n /= 10;
            }

            int tot = sm + p;

            if (tot == i) {
                System.out.println(i);
            }
        }
    }
}
