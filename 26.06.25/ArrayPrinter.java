import java.util.*;

public class ArrayPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++)
        {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < a; i++)
        {
            System.out.print(arr[i]);
            if (i < a - 1) 
            {
                System.out.print(" ");
            }
        }
    }
}
