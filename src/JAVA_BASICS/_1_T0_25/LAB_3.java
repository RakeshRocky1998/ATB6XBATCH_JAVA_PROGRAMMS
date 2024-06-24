package JAVA_BASICS._1_T0_25;

public class LAB_3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(++a); //6
        System.out.println(--a);//5
        System.out.println(a++);//5
        System.out.println(a--);//6
        System.out.println(a++ + a--);//11
        System.out.println(a-- + a++);//9
        System.out.println(++a + a++ + --a);
    }
}
