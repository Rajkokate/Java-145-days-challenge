import java.util.*;
import java.util.Arrays;
public class sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //sorting array using inbuilt array
    public static void main(String[] args) {
        int arr[] = {4,2,5,1,3};

       // Arrays.sort(arr);
        Arrays.sort(arr,0,4); // given range from where to where sort will happend
        printarr(arr);
        

    }
}
