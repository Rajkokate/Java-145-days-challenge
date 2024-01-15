public class bonus {

    public static void pyramidnum(int n){
        for(int i=1;i<=n;i++){// loop for lines where print space or number
            for(int j=1;j<=(n-i);j++){// loop for spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){// loop for number print
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pyramidnum(6);

    }
}
