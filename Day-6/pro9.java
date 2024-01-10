// check prime in pyimized way than previous method using underroot n

import java.util.Scanner;

public class pro9 {

    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        } return true;

    }
    public static void main(String[] args) {
        System.out.print("Enter your n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
}


