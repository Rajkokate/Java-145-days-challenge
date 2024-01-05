// Print number in reverse order 
import java.util.*;
public class pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;


        while (n > 0) {
                 int  lastdigit = n % 10;
               //  System.out.print(lastdigit + " ");//
                 rev = (rev*10) + lastdigit;      
                 n/=10; // value of n b
            
       
        }
        System.out.println(rev);
        

    }
}
