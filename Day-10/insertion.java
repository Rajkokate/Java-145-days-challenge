public class insertion {
    // function for insertion sort algorithm

    public static void insertarr(int array[]){
        for(int i=1;i<array.length;i++){
            int curr = array[i];
            int previ = i-1;
            // finding out correct position  to insert
            while (previ >=0 && array[previ] > curr) {
                array[previ+1] = array[previ];
                previ--;
            }
            // insertion
            array[previ+1] =curr;
        }
    }
    // function for printing array
    public static void printarr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {4,3,5,2,1};
        insertarr(array);
        printarr(array);
    }
}
