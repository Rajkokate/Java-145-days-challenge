//  problem about iterate num from 1 to n and print
// frizz if num is multipl of 3 && buzz if multipl of 5
// if num is multiple of both 3 & 5 then print frizzbuzz.
import java.util.*;
public class pro13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num:-");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FrizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Frizz");

                
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
                
            }
            else {
                System.out.println(i);
            }
        }
    }
}