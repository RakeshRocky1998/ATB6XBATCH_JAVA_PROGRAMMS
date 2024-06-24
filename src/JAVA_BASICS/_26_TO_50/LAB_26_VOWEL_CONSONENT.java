package JAVA_BASICS._26_TO_50;

import java.util.Scanner;

public class LAB_26_VOWEL_CONSONENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char word = sc.next().toLowerCase().charAt(0);

        if ((word=='a') ||(word=='e')||(word=='i')||(word=='o')||(word=='u')){
            System.out.println(word +" Is a VOWEL");
        } else if ((word >= 'a') && (word<='z')) {
            System.out.println(word +" Is a CONSONENT");
        } else{
            System.out.println(word +" INVALID CHARACTER // INPUT");
        }
sc.close();
    }
}
