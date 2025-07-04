import java.io.*;
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read first matrix dimensions and values
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (r1 != r2 || c1 != c2) {
            System.out.print("NOT IDENTICAL");
        } else {
            boolean identical = true;
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    if (a[i][j] != b[i][j]) {
                        identical = false;
                        break;
                    }
                }
                if (!identical) break;
            }

            if (identical) {
                System.out.print("IDENTICAL");
            } else {
                System.out.print("NOT IDENTICAL");
            }
        }
    }
}
