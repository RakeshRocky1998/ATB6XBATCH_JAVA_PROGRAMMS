package JAVA_BASICS._26_TO_50;

import java.util.Scanner;

public class LAB_27_LARGEST_3_NUMBERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 3 numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double largest;

        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println(largest+" IS the LARGEST");
        sc.close();
    }
}
