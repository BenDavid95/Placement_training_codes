import java.io.*;
import java.util.*;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        
        int f = 0;    
 

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for(int j=0;j<c1;j++){
                f=f+a[i][j];
            }
        }
        System.out.print("Sum of All Elements of the Matrix is "+f);
    }
}
