//Write a method  named is Eventhatac
//cepts an int argument.The method should return true if the argument is even,or false otherwise.
//Also write a program to test your method.
import java.util.*;
public class pro4 {
    public static boolean EvenOdd(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int num = sc.nextInt();
        
        if(EvenOdd(num)){
            System.out.println("Num is even  ");
        }else{
            System.out.println("number is odd");
        }
            
        }

    }
    
}
