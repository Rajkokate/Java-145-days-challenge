public class pro3 {
    public static int linerasearch(int number[] , int key){
        for(int i =1;i<number.length;i++){
            if (number[i] == key) {
                return i;                
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 12;

        int index = linerasearch(number, key);
        if (index==-1) {
            System.out.println("Not found key");            
        }else{
            System.out.println("Found your key = " + index);
        }
    }
}
