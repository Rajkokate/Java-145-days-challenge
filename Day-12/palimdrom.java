// check string is palimdrome
import java.util.*;
public class palimdrom {
    public static boolean palimdom(String str){
        for(int i =0;i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i)!=str.charAt(n-1-i)) {
                //not palimdrome
                return false;
            }
        }

        return true;
    }
 public static void main(String[] args) {
    String str = "racecvcar";
    System.out.println(palimdom(str));
 }   
}
