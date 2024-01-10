//Write a Javap rogram to check if a number is a palindrome in Java?(121isapalindrome, 321 is not)
import java.util.*;
public class pro5 {
    public static boolean  ispalimdrone(int num){
        int palimdron = num;

        int reverse = 0;

        while (palimdron != 0) {
            int remaider = palimdron % 10;
            reverse = reverse * 10+ remaider;
            palimdron=palimdron/10;

        }
        if(num==reverse){
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number = ");
    int palimdrone = sc.nextInt();

    if (ispalimdrone(palimdrone)) {

        System.out.println("your number is palimdron");
        
    }
    else{
        System.out.println("not palimdrone");
    }

    

}
    
}
