// // Type promotion include 2 rule
// // 1 . when java interact with expression having byte , short or char it will convert into int  then solve expression 
// //below is example according to rule 1
// public class typepromotion {
//     public static void main(String[] args) {
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)(a));
//         System.out.println((int)(b));
//         System.out.println(b-a);
//     }
    
// }


// // Type promotion include 2 rule
// // 1 . when java interact with expression having byte , short or char it will convert into int  then solve expression 
// //below is example 2 according rule 1
// public class typepromotion {
//     public static void main(String[] args) {
//         short a = 23;
//         byte b = 23;
//         char c = 'w';
//         byte d = (byte)(a+b+c); // here we can before type casting this operation done in form of INT but it cant store value into
//         System.out.println(d); // integer format thats wy we type casted d.
//     }
    
// }

// // Type promotion include 2 rule
// // 2 . if expression content long, double or float then promoted to long , float or douuble respectivly
// //below is example according to rule 2
// public class typepromotion {
//     public static void main(String[] args) {
//         long a = 10;
//         float b = 23.45f;
//         double c = 34;
//         double ans = a+b+c;

//         System.out.println(ans);
//     }
    
// }


// //wrong approch accoding to java but logically right
// public class typepromotion {
//     public static void main(String[] args) {
//         byte a = 12;
//         byte b = (a*2); // 
//         System.out.println(b);
        
//     }
    
// }


//right approch accoding to java ,& logically right
public class typepromotion {
    public static void main(String[] args) {
        byte a = 12;
        byte b = (byte)(a*2); // type conversion done
        System.out.println(b);
        
    }
    
}





