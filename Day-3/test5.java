// checking largets number using loop
import java.util.*;
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println("A is largest");
        }
        else if(b>=c){
            System.err.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
    
}
