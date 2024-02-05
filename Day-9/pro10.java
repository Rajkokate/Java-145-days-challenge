// prefix array using sum calculate
//print subarrays
public class pro10 {
    public static void subarrays(int num[]){
        int curre = 0;
        int subsum = Integer.MIN_VALUE;
        // calculate prefix array
        int prefix[] = new int[num.length];
        
        prefix[0] = num[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + num[i]; 
        }

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                curre = i == 0  ? prefix[j] : prefix[j] - prefix[i-1];
                // for(int k=i;k<=j;k++){
                //     curre += num[k];
                // }
              
                // System.out.println(curre);
                if (subsum < curre) {
                    subsum = curre;  
                }
            }
        }
        System.out.println("your maxsum is = " + subsum);
    }
    public static void main(String[] args) {
        int num[]= {1,-2,6,-1,3};
        subarrays(num);
    }
}

