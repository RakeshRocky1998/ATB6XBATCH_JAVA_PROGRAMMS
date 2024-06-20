package JAVA_BASICS;

public class String_6 {
    public static void main(String[] args) {
        String  a = "Virat Kohili";
        String  b = a.toLowerCase();

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.substring(1));
        System.out.println(a.substring(2,8));
        System.out.println(a.split("V"));
        System.out.println(a.split("V", 4));
        System.out.println(a.substring(0,2));
        System.out.println(a.indexOf("i"));

    }
}
