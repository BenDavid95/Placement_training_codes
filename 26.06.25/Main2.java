import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i + 1; j < n; j++)
            {
                sum += arr[j];
            }
            arr[i] = sum;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
