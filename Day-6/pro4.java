// multiple or product of 2 numbers using functions.
// by using scanner fun we can give input from user
import java.util.*;
public class pro4 {

    public static int multiply(int a , int b){
        int product = a*b;
        return product;

    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value a = ");
        int a = sc.nextInt();
        System.out.print("Enter value b = ");
        int b = sc.nextInt(); // we can run above function by giving input hard code

        int prod = multiply(a,b);
        System.out.println("Product of 2 number = "+ prod);
        // in future if we want to run muliplt fun again simpliy just give numbre below
        prod = multiply(5, 5);
        System.out.println("New product of 2 number = "+ prod);
    }
}
