// print hollow rectangle using simple logic of matrix with loops and function integrration.
import java.util.*;
public class pro1 {
    public static void holl_rect(int row, int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        holl_rect(10, 5);
    }
}