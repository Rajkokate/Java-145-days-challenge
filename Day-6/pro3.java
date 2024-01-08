public class pro3 {
    public static void swap(int num1 , int num2){
       

        int temp;

        //swapping a and b
        temp = num1;
        num1=num2;
        num2=temp;

        System.out.println(" a = " + num1);
        System.out.println(" b = " + num2);


    }
    public static void main(String[] args) {
         int a = 45;
        int b = 10;
        swap(a, b);
    }
}
