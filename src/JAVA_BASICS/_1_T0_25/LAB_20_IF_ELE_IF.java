package JAVA_BASICS._1_T0_25;

import java.util.Scanner;

public class LAB_20_IF_ELE_IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int a = sc.nextInt();

        if(a>20){
            System.out.println("Greater than 20");
        }
        else if (a>10) {
            System.out.println("Greater then 10 less than 20");

        }else {
            System.out.println("Lesser than 20 and 10");
        }
    }
}
