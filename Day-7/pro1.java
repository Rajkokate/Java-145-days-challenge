public class pro1 {

    public static void binDec(int binum){
        int binaryw = binum;
        int pow = 0;
        int decnum=0;

        while (binum > 0) {
            int lastdigit = binum%10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binum=binum/10;

        }
        System.out.println("Your binary num = "+ binaryw);
        System.out.println("Now in decimal num = "+ decnum);

    }
    public static void main(String[] args) {
        binDec(1011);
        
    }
}