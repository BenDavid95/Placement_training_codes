import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChallengeFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int row=1;row<=num;row++){
            for(int space=1;space<=num-row;space++){
                System.out.print(" ");
            }
            
            for(int star=1;star<=num;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}