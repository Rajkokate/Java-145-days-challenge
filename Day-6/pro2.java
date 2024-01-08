import java.util.*;
public class pro2 {
    public static int Calculate(int num1,int num2){ // here we specify return type int instead of void 
// that;s why in last line we write return sum;
        int sum = num1+num2; // num1 num2 are formal parameters
        //System.out.println("Sum Of 2 no = " + sum);
        return sum;

                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        int sum = Calculate(a, b); //a & b are actual parameter / arguments {calling fuction}
        System.out.println("your Sum = " + sum);
    }
}
