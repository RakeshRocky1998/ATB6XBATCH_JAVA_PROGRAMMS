package JAVA_BASICS;

public class LAB_41_SWITCH_YIELD {
    public static void main(String[] args) {
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw  new IllegalStateException("Error");
        };
    }
}

