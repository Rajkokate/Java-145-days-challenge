import java.util.*;  // import packages 
   public class input {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String in = sc.next(); // sc.next only capture input upto space or next line 
            // that's why we uused sc.nextLine()
            System.out.println(in);

          // String namw = sc.nextLine(); // next line will capture all string after space
           //System.out.println(namw);

           //int ind = sc.nextInt(); // for integer input from user
           //System.out.println(ind);

           //float poin = sc.nextFloat();
           //System.out.println(poin);

           //boolean ui = sc.nextBoolean();
           //System.out.println(ui);
        }   
}
