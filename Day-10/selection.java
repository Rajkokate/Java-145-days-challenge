public class selection {
    //selection sort algorithm
    public static void selectionarr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minposition = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minposition] > arr[j]) { // if we change condition is < then print in decresing order array
                    minposition =j;
                    
                }
            }
            //swap in oter loop because we consider minpos is i.
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
        }
    }

    // print sorted array
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
       selectionarr(arr);
       printarr(arr);
    }
}
