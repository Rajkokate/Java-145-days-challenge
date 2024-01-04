// Checking fever from user input
import java.util.*;
public class test10 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp>100) {
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
    }   
    
}
