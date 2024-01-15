// print hollow rectangle using simple logic of matrix with loops and function integrration.

public class pro1 {
    public static void holl_rect(int row, int col){
        // outer loop for row print
        for(int i=1;i<=row;i++){
            // inner loop for columns print
            for(int j=1;j<=col;j++){
                // condition for print only boundry cell .
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