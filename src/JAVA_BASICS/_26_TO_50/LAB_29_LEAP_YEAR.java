package JAVA_BASICS._26_TO_50;

import java.util.Scanner;

public class LAB_29_LEAP_YEAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = sc.nextInt();

        if (a%4==0 && a%100!=0){
            System.out.println("its leap year");
        } else if (a%4==0 && a%400==0) {
            System.out.println("its leap year");
        }else {
            System.out.println("not a leap year");
    }sc.close();
}
}
