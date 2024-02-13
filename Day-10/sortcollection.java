import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sortcollection {
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {4,2,1,5,3,6,2,19,12,16};
        Arrays.sort(arr,0,7,Collections.reverseOrder());
        printarr(arr);
    }
}
