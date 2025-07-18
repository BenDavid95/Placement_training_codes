import java.util.Scanner;

public class ArraySum {

    // Recursive method to calculate sum
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0; // base case
        }
        return arr[n - 1] + sumArray(arr, n - 1); // recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Read the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the recursive function
        int result = sumArray(arr, size);

        // Print the result
        System.out.println(result);

        scanner.close();
    }
}
 