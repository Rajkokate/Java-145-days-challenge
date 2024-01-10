import java.util.*;
public class pro8 {

        public static boolean isprimme(int n){ // inthis isprime 2 more corner cases made(not checking as normal number )

            // we will look this number as condition like num 2. it is alreay prime dont need to check so we write 
            //cond'n for 2num
            //corner cases

            if(n==2){
                return true;
            }
            //boolean prime = true; 
// below only for n>=2
            for(int i =2;i<=n-1;i++){
                if(n%i==0){
                   // prime=false; // don;t need to write extra variable prime .
                    //break;
                    return false; // if is not prime then right false here not going to outter loop.(instead of false we have to write 
                    // prime when variable declared.)
                }

            
            }return true; // or if above condition is false then come outside above loop and right true.
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        System.out.println(isprimme(n));
    }
}
