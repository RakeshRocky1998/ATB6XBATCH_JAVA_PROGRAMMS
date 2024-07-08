package JAVA_BASICS._51_75;

public class LAB_72_ARRAY_MINIMUM_NUMBE {
    public static void main(String[] args) {
        int[] a = {880,20,12,30,70,33,30};
        int b = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]<b){
                a[i]= b;
            }
        }
        System.out.println("Minimum number-->> "+b);
    }
}
