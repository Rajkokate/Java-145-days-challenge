// binomial coefficient
// bf = n!/r!(n-r)!
public class pro6 {
    public static int factorial(int a){

        int f =1;

        // use thefor loop
        for(int i =1; i<=a; i++) { // always remind that value in for loop will initiate withe data type
            f = f * i;
            
        }
        return f;
    }

    public static int bincoffe(int n,int r){
        int fact_r = factorial(n);
        int fact_n = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_r /(fact_n * fact_nmr);

        return bincoeff;
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(bincoffe(5, 2));
    }
}
