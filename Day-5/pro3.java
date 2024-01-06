// print half pyramid of alphabets in continue flow.
public class pro3 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        //outer loop run 4 time = n value.
        for(int line = 1; line<=n;line++){
            // innner loop run = outer loop
            for(int chars = 1; chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
