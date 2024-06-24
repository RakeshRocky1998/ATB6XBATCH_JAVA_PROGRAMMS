package JAVA_BASICS._1_T0_25;

import java.util.Scanner;

public class LAB_24_FIZZBUZZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        if (a >= 3) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FIZZ----BUZZ");
            } else if (a % 5 == 0) {
                System.out.println("BUZZ");
            } else if (a % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println("NO FIZZ NO BUZZ");
            }
        }else{
            System.out.println("IDIOT ENTER PROPER NUMBER");
        }sc.close();
    }
}
