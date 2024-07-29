package JAVA_BASICS._51_TO_75;

public class  LAB_53_CONTINUE_1 {
    public static void main(String[] args) {
        // Continue -> if this is true continue
        for (int i = 0; i <=50 ; i++) { // 10 Times, i 0 to 9

            if(i%2==0){
                System.out.println(i +" --> is EVEN");
                 continue;
            }
            System.out.println(i +" --> is ODD");

        }


    }
}

