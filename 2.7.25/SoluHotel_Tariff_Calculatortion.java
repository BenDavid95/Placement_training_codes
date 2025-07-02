import java.io.*;
import java.util.*;

public class SoluHotel_Tariff_Calculatortion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int rent = sc.nextInt();
        int days = sc.nextInt();
        int total;
        
        if(month>=1 && month<=12){
            if((month>=4 && month<=6) || (month>=11 && month<=12))
            {
                rent = rent + rent * 20/100;
                total = rent * days;
            }
            else
                total = rent * days;
            System.out.println(total);
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}