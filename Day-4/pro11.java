import java.util.Scanner;

public class pro11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter your Number :- ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                 continue;

            }
            System.out.println("your number is -" +n);
               
        }while(true);

        //System.out.println("out of loop");
    }
}
