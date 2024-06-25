package JAVA_BASICS._26_TO_50;

public class LAB_48_FIZZBUZZ {
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZ----BUZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}

