import java.io.*;
import java.util.*;
public class DeptRepay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float loan = sc.nextFloat();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();
        
        float interest = loan*rate*time/100;
        float amount = interest + loan;
        float discount = interest * 2/100;
        float final_amt = amount - discount;
        
        System.out.printf("%.2f\n",interest);
        System.out.printf("%.2f\n",amount);
        System.out.printf("%.2f\n",discount);
        System.out.printf("%.2f\n",final_amt);
    }
}