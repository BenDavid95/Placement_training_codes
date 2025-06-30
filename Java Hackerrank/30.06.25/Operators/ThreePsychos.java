import java.io.*;
import java.util.*;

public class ThreePsychos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        
        Float mid1=(x1+x2)/2.0f;
        Float mid2=(y1+y2)/2.0f;
        
        System.out.print("Arun's house is located at("+mid1+","+mid2+")");
    }
}