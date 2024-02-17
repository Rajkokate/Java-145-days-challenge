public class diagonal {

    public static int diagonalsum(int matrix[][]){ // because we want to return sum of diagonal thats y we write int 
        int sum =0;

        //primary diagonal element sum
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if (i==j) {
        //             sum += matrix[i][j]; 
        //         }else if (i+j == matrix.length-1) {   //secondary diagonal element 
        //             sum += matrix[i][j];
        //         }
        //         /// but we did;nt write optimized code it just brute force code
        //         //time comple=O(n^2)
        //     }
        // }

        for(int i=0;i<matrix.length;i++){  // now time complex is O(n)
            //primary diagonal
            sum += matrix[i][i]; // cause i==j
                
            //secondary diagonal
            if (i != matrix.length-i-1) // inthis we have to add overlap condition

                
              sum += matrix[i][matrix.length-i-1];
        }
        return sum;
       
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
       };
       System.out.println(diagonalsum(matrix)); //

    }
}
