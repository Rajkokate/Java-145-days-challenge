public class pro5 {
    public static int factorial(int a){

        int f =1;

        // use thefor loop
        for(int i =1; i<=a; i++) { // always remind that value in for loop will initiate withe data type
            f = f * i;
            
        }
        return f;
    }

    public static void main(String[] args) {

        System.out.println(factorial(7));
        
    }
}
