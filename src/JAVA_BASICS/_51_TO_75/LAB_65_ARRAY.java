package JAVA_BASICS._51_TO_75;
public class LAB_65_ARRAY {
    public static void main(String[] args) {
        // == -> checks for reference
        // .equals -> checks for value/content
        int a = 10;int b = 10;
//        System.out.println(a==b);
//        System.out.println();
        int[] s = {1,2,3,4};
        int[] t = {1,2,3,4};
        System.out.println(s.equals(t));
        System.out.println(s==t);
 //BOTH above lines are same -> IN ARRAY -> BOTH checks for REFERENCE
        //STRING check for CONTENT
        int[] u = s;
        System.out.println(u==s);
        System.out.println(s.equals(t));// - coming from OBJECTS.java class
        System.out.println(u.equals(s));// - coming from OBJECTS.java class
        System.out.println(u.equals(t));// - coming from OBJECTS.java class
        String q = "rakesh";
        String w = "rakesh";
        System.out.println(q.equals(w)); //check content //coming ->STRINGS.java class
        System.out.println(q==w);//check reference

        // ONLY STRING EQUAL TO METHOD CHECKS FOR CONTENT



    }
}
