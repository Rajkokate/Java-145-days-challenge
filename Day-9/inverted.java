// inverted rotated pyramid 
public class inverted {

    public static void invertedpyramid(int n){
        // loop 1 for rows
        for(int i=1;i<=n;i++){
            // loop 2 for print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            // loop 3 for print *
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedpyramid(5);
    }
}
