package JAVA_BASICS;

import java.util.Scanner;

public class LAB_19_MAXIMUM_OF_2_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 1st NUMBER");
        int a = sc.nextInt();
        System.out.println("ENTER THE 2nd NUMBER");
        int b = sc.nextInt();
        int c = Math.max(a,b);
        System.out.println("Bigger number is-->" + c);

//        if(a>b){
//            System.out.println(a +" is BIGGER Than " + b);
//        }else {
//            System.out.println(b +" is BIGGER Than " + a);
//        }
sc.close();
    }
}
