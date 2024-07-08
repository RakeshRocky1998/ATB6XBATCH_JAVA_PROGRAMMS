package JAVA_BASICS._51_75;

public class LAB_73_ARRAY_PRINT_ALL {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print all elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
//Explanation:
//Array Declaration and Initialization:
//
//int[] numbers = {1, 2, 3, 4, 5}; declares an array named numbers of type int and initializes it with five elements: 1, 2, 3, 4, 5.
//Printing Array Elements:
//
//        System.out.println("Elements of the array:"); prints a message indicating that the following lines will display the elements of the array.
//for (int i = 0; i < numbers.length; i++) { ... } iterates through each element of the numbers array.
//        System.out.println(numbers[i]); prints each element of the array on a new line.
