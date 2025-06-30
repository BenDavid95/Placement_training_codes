import java.io.*;
import java.util.*;

public class Ascii1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char character = sc.nextLine().charAt(0); 
        int asciiValue = (int) character; 
        System.out.println(asciiValue);
    }
}
