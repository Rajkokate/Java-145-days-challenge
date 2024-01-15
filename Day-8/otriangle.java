// 0-1 triangle pattern print
public class otriangle {
    public static void trinagle(int n){
        for(int i=1;i<=n;i++){ // outer loop
            for(int j=1;j<=i;j++){ //innner loop
                if((i+j)%2==0){ // here we check cell sum is odd or even
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        trinagle(5);
    }
}
