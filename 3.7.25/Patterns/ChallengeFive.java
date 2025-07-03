import java.util.*;

public class ChallengeFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int row = 1; row <= num; row++) {
            int val;
            if (row % 2 == 0) {
                val = 2;
                } else {
                val = 1;
                }

            
            for (int col = 1; col <= row; col++) {
                System.out.print(val);
                val += 2; 
            }
            System.out.println();
        }
    }
}
