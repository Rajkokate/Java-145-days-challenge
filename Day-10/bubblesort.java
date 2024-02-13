public class bubblesort{
    // function for sorting array
    public static void bubbles(int num[]){
        for(int turn=0; turn<num.length-1;turn++){
            for(int j=0;j<num.length-1-turn;j++){
                if (num[j] > num[j+1]) {
                    //swap
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp; 
                    
                }
            }
        }
    }
    // function for creating array
    public static void printarray(int num[]){
        for(int i =0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = {5,3,4,1,2};
        bubbles(num);
        printarray(num);
    }
}