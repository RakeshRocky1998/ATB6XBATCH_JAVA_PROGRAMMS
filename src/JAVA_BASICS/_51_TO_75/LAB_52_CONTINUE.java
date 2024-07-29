package JAVA_BASICS._51_TO_75;

public class LAB_52_CONTINUE {
    public static void main(String[] args) {
        // Continue -> if this is true continue
        for (int i = 0; i < 10 ; i++) { // 10 Times, i 0 to 9
            System.out.println(i);
            if(i ==5){
                continue;
            }
            System.out.println("After!!");

        }


    }
}

