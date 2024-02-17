//Write a program to FindTransposeofa Matrix.
//What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. 
//For a 2x3 matrix,Matrixa11    a12    a13
                       //a21    a22    a23
                       //Transposed Matrix
                       //a11    a21    a12    
                       //a22    a13    a23
public class sol {

    public static void printMatrix(int[][]matrix){
        //System.out.println("The matrix is: ");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { {2,3,7}, {5,6,7} };
        int row = 2 , col = 3;
        

        int[][] transpose = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose [j][i] = matrix[i][j];
            }
        }

        System.out.println("your original matrix");
        printMatrix(matrix);  // printed original matrix
       // System.out.println("your transpose matrix");
        printMatrix(transpose);  // printed transpose matrix
    }
}
