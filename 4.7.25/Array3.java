import java.io.*;
import java.util.*;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r1 = sc.nextInt();
        int c1 = r1;
        int[][] a = new int[r1][c1];
        
        int f = 0;    
        int max = 0;  
        int row = -1;  

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            f = 0; 
            for (int j = 0; j < c1; j++) {
                if (a[i][j] == 0) {
                    f = f + 1;
                }
            }
            if (f > max) {
                max = f;
                row = i;
            }
        }

        if (max > 0) {
            System.out.print(row);
        } 
        else {
            System.out.print("No row has zeros");
        }
    }
}
