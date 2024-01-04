//Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.*;
public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0) {
            System.out.println("x is greater than 0 it is positive");
        }
        else{
            System.out.println("x is less than or equal 0 it is negative");
        }
    }
}
