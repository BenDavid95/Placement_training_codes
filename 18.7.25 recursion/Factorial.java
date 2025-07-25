import java.util.Scanner;

public class Factorial {
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        long result = factorial(number);
        
        System.out.println("The factorial of " + number + " is " + result);
        
        scanner.close();
    }
}
