package JAVA_BASICS;

import java.util.Scanner;

public class LAB_25_Positive_Negative_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int a = sc.nextInt();

        if (a>0){
            System.out.println("POSITIVE");
        } else if (a<0) {
            System.out.println("NEGATIVE");
        }else {
            System.out.println("ITS ZEROO");
        }
        sc.close();
    }
}
