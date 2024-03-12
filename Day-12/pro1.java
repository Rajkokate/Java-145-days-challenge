import java.util.*;
public class pro1{
    public static void printleter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str1 = "abcd";
        String str2 = new String("xyzABc@123"); // all valid in string java


        Scanner sc = new Scanner(System.in);

        String name;
        name = sc.nextLine();
        System.out.println(name);


        // lets count the length of string

        String fulllength = sc.nextLine();
        System.out.println(fulllength.length());



        // let's concatenate 2 string or multple using +

        String firstname = "Rajdatt";
        String lastname = "Kokate";

        String Fullname = firstname + " " + lastname;
       // System.out.println(Fullname);
        printleter(Fullname);
    }
}
