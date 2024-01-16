public class butterfly {

    public static void butterfly1(int n){
        // 1st half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //stars
                System.out.print("*");
            } // space printusing logic 2*(n-i)
            for(int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half with same logic only change in outer loop 
        // outer loop will run in reverse pattern
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                //stars
                System.out.print("*");
            } // space printusing logic 2*(n-i)
            for(int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        butterfly1(8);
    }
}
