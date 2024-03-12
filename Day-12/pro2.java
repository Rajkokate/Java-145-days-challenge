//checking == not working always in scase of strings beacuse of interning
public class pro2 {
    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String st = new String("Tony");

        if (str1==str2) {
            System.out.println("Equal");
            
        }else{
            System.out.println("not");
        }

        if (str1==st) {// not working beacuse of internig
            System.out.println("Equal");
            
        }else{
            System.out.println("not");
        }

        if (str1.equals(st)) {
            System.out.println("Equal2");
        }else{
            System.out.println("not");
        }
    }
}
