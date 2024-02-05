//print subarrays
public class pro9 {
    public static void subarrays(int num[]){
        int curre = 0;
        int subsum = Integer.MIN_VALUE;
       
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                curre = 0;
                for(int k=i;k<=j;k++){
                    curre += num[k];
                }
              
                System.out.println(curre);
                if (subsum < curre) {
                    subsum = curre;  
                }
            }
        }
        System.out.println("your maxsum is = " + subsum);
    }
    public static void main(String[] args) {
       // int num[]= {1,-2,6,-1,3};
        int num[]= {2,4,6,8,10};
        subarrays(num);
    }
}
