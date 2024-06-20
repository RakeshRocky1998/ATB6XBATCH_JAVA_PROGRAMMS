package JAVA_BASICS;

public class String_2 {
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
