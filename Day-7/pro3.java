//Write a Java method to compute the average of three numbers.
public class pro3 {
    public static int average(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(average(2,3,4));
    }
}
