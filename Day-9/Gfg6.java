class Solution
{
    public static boolean checkPangram  (String s) {


        s = s.toLowerCase();
        int ar[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                int pos = s.charAt(i) - 97;
                ar[pos]++;
            }
        }
        
        boolean flag = true;
        for(int k: ar){
            if(k==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
