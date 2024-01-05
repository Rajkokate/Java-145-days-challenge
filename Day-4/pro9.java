// enter the number until 10 number is given
import java.util.*;
public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter your Number :- ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                 break;

            }
            System.out.println(n);
               
        }while(true);

        System.out.println("out of loop");
    }
}
