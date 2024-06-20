package JAVA_BASICS;

public class String_4 {
    public static void main(String[] args) {
        String a = "Rakesh";
        String b = "Rakesh ";
        System.out.println(a.equals(b));
        System.out.println(a==b);

        System.out.println(a.charAt(0));
        char e = a.charAt(1);
        System.out.println(e);
        String  c = new String("Rakesh");
        String  d = new String("Rakesh ");
        System.out.println(c.equals(d));
        System.out.println(c==d);


    }
}
