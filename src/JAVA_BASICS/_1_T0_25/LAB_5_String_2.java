package JAVA_BASICS._1_T0_25;

public class LAB_5_String_2 {
    public static void main(String[] args) {
        String a = "Rakesh";
        String b = new String("Rakesh");
        String c = "rakesh";

        System.out.println(a.equals(b));
        System.out.println(a==b);

        System.out.println(a.equals(c));
        System.out.println(a==c);

    }
}
