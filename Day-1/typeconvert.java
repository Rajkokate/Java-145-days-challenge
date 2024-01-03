// type conversion - 2 condition 
// 1. both data types are compatible 
//2. dest type >  source type
public class typeconvert {
    public static void main(String[] args) {
        int a = 25; // source type int with 4 byte
        long b = a; // dest type long with 8 byte
        System.out.println(b); // condition satisfied so code give o/p.
    }
}

// But if we try to code vise vera it's not working because 2nd condi not satisfied.
// also we can do one thing give input in integer and java convert into float.
/* 
import java.util.*;
public class typeconvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();
        System.out.println(num);
    }
}
*/