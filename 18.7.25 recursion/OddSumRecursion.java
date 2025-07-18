import java.util.Scanner;

public class OddSumRecursion {
    public static int sumOdd(int[] arr, int n) {
        if (n == 0) return 0;  

        int lastElement = arr[n - 1];
        if (lastElement > 0 && lastElement % 2 != 0) {
            return lastElement + sumOdd(arr, n - 1); 
        } else {
            return sumOdd(arr, n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = sumOdd(arr, n);

        System.out.println("Sum = " + result);
    }
}
