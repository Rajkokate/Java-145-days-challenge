// print pyramid of number 
import java.util.*;
public class pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number -");
        int n = sc.nextInt();
// outer loop
        for(int line = 1; line<=n; line++){
            //inner loop
            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
