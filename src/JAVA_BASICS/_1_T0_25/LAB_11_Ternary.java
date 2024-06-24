package JAVA_BASICS._1_T0_25;

public class LAB_11_Ternary {
    public static void main(String[] args) {
        boolean a = 10<20 ? 10 >20 : 10<20;
        System.out.println(a);

        int b = true ? 10 : 20 ;
        int c =  100>500 ? 10 : 20;
        System.out.println(b);
        System.out.println(c);

        int q = 100;
        int w = 200;
        int max = q>w ? q: w;
        int min = q>w ? w: q;

        System.out.println(max);
        System.out.println(min);

        int maxx = q<w ? w: q;
        int minn = q<w ? q: w;

        System.out.println(maxx);
        System.out.println(minn);

    }
}
