package JAVA_BASICS;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class LAB_21_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur marks");
        int a = sc.nextInt();
        char grade = 'F';

        if (a>=90 && a==100){
            grade = 'A';
        }else if (a>=80 && a<=89) {
            grade = 'B';
        }else if (a>=70 && a<=79) {
            grade = 'C';
        }else if (a>=60 && a<=69) {
            grade = 'D';
        }else if (a>=50 && a<=59) {
            grade = 'E';
        }else if (a>=0 && a<=49) {
            grade = 'F';
        }else if (a>100){
            System.out.println("LLLLLOLLLLLLLLL");
            grade = 'Z';
        }else if (a<0){
            grade = 'Z';
            System.out.println("ARE U MAD");
        }
        System.out.println("YOUR GRADE "+ grade);
        sc.close();
    }
}
