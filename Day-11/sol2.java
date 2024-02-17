//Print out the sum of the numbers inthe second row of the “nums” array
public class sol2 {
    public static void main(String[] args) {
        int[][] matrix = { {1,4,9},{11,4,3},{2,2,3} }; // inthis we have to fix row number and col should be move

        int sum = 0;
        //for 2nd row

        for(int j=0;j<matrix[0].length;j++){
            sum += matrix[1][j];
        }
        System.out.println("your sum of row 2 is = " + sum);
    }
}
