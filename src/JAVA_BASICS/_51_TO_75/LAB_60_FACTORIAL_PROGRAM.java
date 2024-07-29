package JAVA_BASICS._51_TO_75;

import java.util.Scanner;

public class LAB_60_FACTORIAL_PROGRAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b= 1;

if (a>0){
        for (int i = 1; i <=a ; i++) {
             b = b*i;
        }
        System.out.println(b);
    }
else {
    System.out.println("enter proper number");
}
}
}
