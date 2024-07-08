package JAVA_BASICS._51_75;

import java.util.Scanner;

public class LAB_70_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        System.out.println("ENTER SUBJECT ENGLISH");
        a[0] = sc.nextInt();
        System.out.println("ENTER SUBJECT MATHS");
        a[1] = sc.nextInt();
        System.out.println("ENTER SUBJECT SCIENCE");
        a[02] = sc.nextInt();

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] <= 100 && a[i]>=0) {
//                if (a[i]<35) {
//                    System.out.println("YOU FAILED ");
//                }
//            else {
//                System.out.println("PASS WITH SUBJECT SCORE -->>" + a[i]);
//            }
//            }else{
//                System.out.println("IDIOT ENTER THE MARKS PROPERLY");
//        }
//    }

        int j = 0;
        while (j<a.length){
            System.out.println("PASS WITH SUBJECT SCORE -->>"+a[j]);
            j++;
        }
        sc.close();
}

}
