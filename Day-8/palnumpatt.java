public class palnumpatt {
    public static void palnum(int n){
        for(int i=1;i<=n;i++){// outer loop
            //loop for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // loop for number in desending
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // loop for number asending from 2 to i
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();// print nextline
        }
    }
    public static void main(String[] args) {
        palnum(4);
    }
}
