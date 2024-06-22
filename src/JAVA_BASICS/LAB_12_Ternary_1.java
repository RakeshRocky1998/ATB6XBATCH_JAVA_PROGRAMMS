package JAVA_BASICS;

public class LAB_12_Ternary_1 {
    public static void main(String[] args) {

       double c =  Math.cbrt ( (Math.pow(10,2)+  Math.pow(10,2)) - Math.abs(10));

       double a = (Math.pow(25,3) + Math.pow(22,4)) - Math.abs(29);
       double b = Math.cbrt(a);

        System.out.println(c);
        System.out.println(b);



//       int a = 10, b = 20, c= 30;
//        int a = 20, b = 30, c= 10;
//          int a = 30, b = 10, c= 20;
//
//        int max = a > (b>c?b: c) ? a :((b>c?b:c));
//        System.out.println(max);

//        int a = 10;
//        System.out.println(++a + a++ + ++a);
                //+ ++a);

        //With ++a, a is incremented first, and that is the value you get;
        // with a++ you get the value of a, and a is incremented afterwards

//        int b = 10;
//        System.out.println(--b + b++ + ++b);

    }
}
