import java.io.*;
import java.util.*;

public class NumberSeries{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int term = 0;     
        int diff = 2;      
        int repeat = 0;    

        for (int i = 0; i < n; i++) {
            System.out.print(term);
            if (i != n - 1) System.out.print(" ");

            repeat++;
            if (repeat == 2) {
                diff += 4;
                repeat = 0;
            }

            term += diff;
        }
    }
}