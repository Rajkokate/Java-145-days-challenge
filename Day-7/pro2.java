// code for decimal to binary
public class pro2 {

    public static void DecBin(int n){
        int dec = n;
        int pow = 0;
        int binnum = 0;

        while (n > 0) {

            int remaider = n  % 2;
            binnum = binnum + (int)(remaider*Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("conversion from dec = "+ dec);
        System.out.println("Into binary  = "+ binnum);
    }
    public static void main(String[] args) {
        DecBin(7);
    }
}
