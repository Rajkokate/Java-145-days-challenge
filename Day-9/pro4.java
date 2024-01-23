public class pro4 {
    public static int largestnum(int number[]){
        int largest = Integer.MIN_VALUE; // -infinity value
        int smallestt = Integer.MAX_VALUE;// +infinity value

        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallestt > number[i]){
                smallestt = number[i];
            }
        }
        System.out.println("Your smallest num is = "+ smallestt);
        return largest;
        
    }
    public static void main(String[] args) {
        int number[] = {2,5,46,6,8,35};
        System.out.println("Your largest num is = "+ largestnum(number));
    }
}

// vise versa for +infinity that is small number in array.