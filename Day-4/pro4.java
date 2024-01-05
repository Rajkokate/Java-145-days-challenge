// Print sum of first n natural numbers
import java.util.*;
public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        int sum = 0;
        while (i <= n) {
            sum+=i;
            i++;
            //System.out.print(sum + " ");
            //System.out.println();
            System.out.print(i + " ");

            
        }
        System.out.println("sum of num" + sum);
    }
}
