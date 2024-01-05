// code for checking number is prime or nott 
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your n-");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("your number is prime");
        } else{
        boolean isprime = true;  /// because when we use n-1 it will run all time and after somme time it will repeat value i.e.half 
        // so basically we need only half value i.e. root of n
        for(int i = 2; i<= Math.sqrt(n); i++){ // here we need some time optimization instead of n-1 we have write sqrt(n) using javaMath Module

            if (n % i == 0) { // n is multipl i where (i is not equal to  1 or n)
                isprime = false;   
            }
            
        }

        if (isprime==true) {
            System.out.println("your number is prime");   
        } else{
            System.out.println("your number is not prime");
        }    


        }
        


    }
}
