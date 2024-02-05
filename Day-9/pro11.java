// subarray sum using kadane's algorithm
public class pro11 {
    public static void kadane(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =1;i<arr.length;i++){
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("your subarray sum = "+ ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        //int num[]= {1,-2,6,-1,3};
        int num[]= {2,4,6,8,10};
        kadane(arr);
        kadane(num);
    }
}
