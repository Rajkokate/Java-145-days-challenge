// creating function for printing diamond function using for loop logic and mathemtical logics
public class diamond {
    public static void diamond(int n){

        //outer loop i = lines 
        for(int i=1;i<=n;i++){
            //inner loops
            for(int j=1;j<=(n-i);j++){//loop for print initial spaces
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){// loop for print * 
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){// reverse loop for print half diamond
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(20);
    }
}
