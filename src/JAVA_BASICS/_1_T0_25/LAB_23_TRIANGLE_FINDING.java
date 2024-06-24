package JAVA_BASICS._1_T0_25;

import java.util.Scanner;

public class LAB_23_TRIANGLE_FINDING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle SIDE1");
        int side1 = sc.nextInt();
        System.out.println("Enter the sides of triangle SIDE2");
        int side2 = sc.nextInt();
        System.out.println("Enter the sides of triangle SIDE3");
        int side3 = sc.nextInt();


        if ((side1 == side2) && (side2==side3) && (side3==side1)){
            System.out.println("EQUILATERAL TRIANGLE");
        } else if ((side1==side2) || (side2==side3)|| (side3==side1)) {
            System.out.println("ISOCELESE TRIANGLE");
        }else {
            System.out.println("SCALENE TRIANGLE");

        }sc.close();
    }
}
