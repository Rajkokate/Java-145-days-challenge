import java.util.*;
public class circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat(); // nextfloat for getting input into the float type.
        float area = 3.14f * rad * rad; // by default java get value of decimal as double so we specifiy using 'f' after 3.14
        System.out.println(area); // calculating area of circle
    }
}
