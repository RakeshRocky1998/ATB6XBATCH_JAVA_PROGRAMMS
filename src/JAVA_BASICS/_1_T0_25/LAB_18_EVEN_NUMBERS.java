package JAVA_BASICS._1_T0_25;

import java.util.Scanner;

public class LAB_18_EVEN_NUMBERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR FAV NUMBER");
        int a = sc.nextInt();


        if (a % 2 == 0){
            System.out.println("EVEN");
        }
        else {

            System.out.println("ODD");
        }
        sc.close();
    }
}
