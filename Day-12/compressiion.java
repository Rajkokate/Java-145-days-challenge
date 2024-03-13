// string compression using string builder

public class compressiion {

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");

      //  char ch = 1;
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while (i<str.length()-1 &&  str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count).toString();
            }
        }
        return sb.toString();
    }
     public static void main(String[] args) {
        String str = "aaabbccddss";
        System.out.println(compress(str));
     }
}