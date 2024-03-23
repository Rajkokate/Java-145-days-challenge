//odd even using bitwise  operator &(and)
import java.util.*;;
public class oddeven {
    public static void oddeven(int n){
        int Bitmass = 1;
        if ((n & Bitmass) == 0) {
            System.out.println("num is even");
        }else{
            System.out.println("num is odd");
        }
        return;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter your number(press 0 to exit):>");
            n = sc.nextInt();
            if(n==0){
                System.out.println("Exiting code !!!");
                break;
            }
            oddeven(n);
        }
    }
}
