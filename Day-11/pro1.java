// import java.util.Scanner;

// public class pro1{
//     public static boolean searchcell(int matrix[][] ,int key){
//         for(int i =0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if (matrix[i][j] == key) {
//                     System.out.println("found at cell ("+ i +","+ j + ")");     
//                     return true;                     
//                 }
//             }
            
//         }
//         System.out.println("key not found");
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length ,  m = matrix[0].length;
        
//         //loop for input
//         Scanner sc = new Scanner(System.in);
//         for(int i =0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         //loop for output
//         for(int i =0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         searchcell(matrix, 41);
        
//     }
// }

import java.util.Scanner;

public class pro1 {
    public static boolean searchCell(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static int findSmallestElement(int matrix[][]) {
        int smallest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static int findLargestElement(int matrix[][]) {
        int largest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // Loop for input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Loop for output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int smallest = findSmallestElement(matrix);
        int largest = findLargestElement(matrix);

        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);

        searchCell(matrix, 41);
    }
}
