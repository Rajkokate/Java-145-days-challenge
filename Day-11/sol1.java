//Print the number of 7’s that are in the 2d array count num appearin array
public class sol1 {
    public static void main(String[] args) {
        int[][] matrix = {{4,79,98},{8,8,7}};

        int count = 0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("your number appear is =" + count);
    }
}
