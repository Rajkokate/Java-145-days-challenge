public class pro5 {
    public static int binarysearch(int number[] , int key){
        int start =0 , end = number.length-1;
        
        while (start <= end) {
            int mid = (start+end) /2;
            //comparison with mid index number in array
            if (number[mid]==key) { // when number found at mid index
                return mid;
            }
            if (number[mid] < key) {// when number is less than mid then forward to right
                start = mid+1;
            }else{//when number is larger than mid then forward to left
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 8;

        System.out.println(" your number is = " + binarysearch(number, key));
    }

}
