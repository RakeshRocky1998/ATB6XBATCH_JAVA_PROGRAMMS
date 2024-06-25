package JAVA_BASICS._26_TO_50;

import java.util.Scanner;

public class LAB_44_SWITCH_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();
        System.out.println("Enter what to do with entered number/which operation");
        char c = sc.next().charAt(0);

        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("WRONG OPERATION");

        }
        sc.close();
    }
}
