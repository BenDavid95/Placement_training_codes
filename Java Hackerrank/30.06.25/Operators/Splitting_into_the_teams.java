import java.util.*;

public class Splitting_into_the_teams {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int g=sc.nextInt();
        int n=t%g;
        int d=t/g;
        System.out.print("The number of friends in each team is "+d+" and left out is "+n);
        
    }
}