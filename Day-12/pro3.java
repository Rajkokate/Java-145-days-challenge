// formed a function for printing substring form given string
public class pro3 {
    public static String Substr(String str,int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "hellow world";
        //System.out.println(Substr(str,0,4));
        System.out.println(str.substring(0,4));

        //there is inbuilt function for print substring

    }
}
