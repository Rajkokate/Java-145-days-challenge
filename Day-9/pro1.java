import java.util.*;
public class pro1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num[] = new int[50]; // type 1 to write array size=50 but now is empty
    
    int num2[] = {1,2,3};// type 2 size=3

    String friut[] = {"apll","mango"};// type 3 size=3



    num[0] = sc.nextInt();
    num[1] = sc.nextInt();
    num[2] = sc.nextInt();

    System.err.println("phy :" + num[0]);
    System.err.println("chem :" + num[1]);
    System.err.println("bio :" + num[2]);

    num[2] = 100;
    System.err.println("bio :" + num[2]);
    System.err.println("length of array" + num.length);

    }
}
