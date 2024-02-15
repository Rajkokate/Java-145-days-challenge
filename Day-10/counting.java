public class counting {
    public static void countingsort(int arr[]){
        int n = arr.length;
        // find lagest number for count array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            largest = Math.max(largest, arr[i]);
        }
        // now creating count array for above range
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;  //here we count frequency of number appeared in array
        }
        //sorting step using counting algo
        int j = 0; // here we adding our sorted frequencu number
        for(int i=0;i<count.length;i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
                
            }
        }

    }

    public static void prinarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3,4};
        countingsort(arr);
        prinarr(arr);
    }
}
