// inverted * pattern print
// Always follow 3 golden rule printing pattern
/*
 * 1. outer loop run how many times
 * 2. inner loop run how many times
 * 3. what do you want to print * or number or character
 */
import java.util.*;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :-");
        int n = sc.nextInt();

        for(int line = 1; line<=n;line++){
            for(int star = 1; star<=n-line+1;star++){
                System.out.print(" * ");

            }
            System.err.println();
        }
    }
}
