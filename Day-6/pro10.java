import java.util.Scanner;

public class pro10 {
    // below function for checking number prime or not in optimized way under root n
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int n){ // this function will give range of prime nunmber from 2 to n
        // using helper function isprime.
        for(int i =2; i<=n;i++){
           if(isPrime(i)){
            System.out.print(i+" ");
           }
        }System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primeinrange(20);

        while (true) {
            System.out.print("Enter a number (enter 0 to exit): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            boolean result = isPrime(n);
            if (result) {
                System.out.println(n + " is prime.");
            } else {
                System.out.println(n + " is not prime.");
            }
        }

        sc.close();
    }
}