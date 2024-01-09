// function overloading using parametrs
public class pro7 {
    public static int sum(int a, int b){ // first function with 2 para.
        return a+b;
    }

    public static int sum(int a , int b, int c){ // second function with 3 para and same return type.
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(5, 03, 2));
    }
}
