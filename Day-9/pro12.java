public class pro12 {
    public static int trappedho(int height[]){
        //left max booundrry
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //right max boundry
        int rightmax[] = new int[height.length];    
        rightmax[height.length-1] = height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            rightmax[j] = Math.max(height[j], rightmax[j+1]);
        }
        int trappedwater =0;
        //looop
        for(int i=0;i<height.length;i++){
            //waterlevel find
            int waterlevel =Math.min(leftmax[i], rightmax[i]);

            // traped water
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedho(height));
    }
}
