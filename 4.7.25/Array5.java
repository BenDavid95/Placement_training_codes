import java.io.*;
import java.util.*;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r1 = sc.nextInt();        
        int c1 = r1;                   
        int n = sc.nextInt();        
        
        int[][] a = new int[r1][c1];
        int f = 0;                   

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (n == a[i][j]) {
                    System.out.print("Element found at row " + i + " and col " + j);
                    f = 1;
                    break; 
                }
            }
            if (f == 1) {
                break; 
            }
        }

        if (f == 0) {
            System.out.print("Element not found");
        }
    }
}
