package JAVA_BASICS._26_TO_50;

import java.util.Scanner;

public class LAB_45_LARGEST_3_NUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 3 numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double largest;



            double max = a > (b>c?b: c) ? a :((b>c?b:c));
            largest= max;
        System.out.println(largest);

    }
}