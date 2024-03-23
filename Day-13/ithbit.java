public class ithbit {
    //Getith bit
    public static int Getithbit(int n , int i){
        int bitmask = 1<<i;

        if ((n & bitmask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    //Setith bit
    public static int Setithbit(int n , int i){
        int bitmask = 1<<i;

        return n | bitmask;
    }

    public static int Clearithbit(int n , int i){
        int bitmask = ~(1<<i);

        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Getithbit(10,2));
        System.out.println(Setithbit(10, 2));
        System.out.println(Clearithbit(10, 1));
    }
}
