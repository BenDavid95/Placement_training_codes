import java.util.*;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a]; 
        int k = 0;

        for (int i = a ; i > 1; i--) {
            int c = 0; 

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c++; 
                }
            }

            if (c == 0) {
                arr[k] = i;
                k++;
            }
        }
        //Arrays.sort(arr);
        for (int l = k; l >=0; l--) {
            if(arr[l]==0){
                continue;
            }
            System.out.print(arr[l] + " ");
        }
    }
}
