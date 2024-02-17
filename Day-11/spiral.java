public class spiral {

    public static void printspiral(int matrix[][]){
        int startrow = 0;
        int starcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while (startrow <= endrow && starcol <= endcol) {
            // print top  printing in col fashion
            for(int j=starcol;j<=endcol;j++){  // here we assumed j is for column 
                System.out.print(matrix[startrow][j] + " "); // and i is for row
            }

            //print for right printing in row fashion
            for(int i = startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol] + " ");
            }

            //print for bottom printing in col fashion
            for(int j=endcol-1;j>=starcol;j--){
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            //print for left printing in row fashion
            for(int i=endrow-1;i>=startrow+1;i--){
                if (starcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][starcol] + " ");
            }

            starcol++;
            startrow++;
            endcol--;
            endrow--;
            

            
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
       };

       printspiral(matrix);
    }
}
