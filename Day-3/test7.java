// Switch Statement example
import java.util.*;
public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // case is not always int it will be char also like a , b ,c  so in stead of case 1 we have to write case a:

        switch (number) {
            case 1: {System.out.println("car");}
                
                break;
            case 2: System.out.println("job");
                break;
            
                case 3: System.out.println("bunglow");
        
            default:
                
        }
    }
}
