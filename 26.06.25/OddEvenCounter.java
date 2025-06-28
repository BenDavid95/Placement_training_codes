import java.util.*;
public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd = " + oddCount);
        System.out.println("Even = " + evenCount);
    }
}
