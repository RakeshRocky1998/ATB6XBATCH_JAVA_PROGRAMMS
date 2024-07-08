package JAVA_BASICS._51_75;

public class LAB_74_ARRAY_DOUBLE_ARRAY{
    public static void main(String[] args) {
        int[] a = {154, 254, 553};  // Original array
        int[] b = new int[a.length];  // Array to store doubled values

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * 2;  // Double each element
        }

        // Print the doubled array
        for (int value : b) {
            System.out.print(value + " ");
        }
    }
}
//
//Explanation:
//Main Method:
//An example array a is defined with the values {1, 2, 3}.
//A new array b is created with the same length as a to store the doubled values.
//        A for loop iterates through each element of a, doubling the value and storing it in the corresponding position of b.
//The doubled array b is then printed to the console using a for-each loop.
//
//
//For-each Loop
//A for-each loop is used to iterate through elements in an array or a collection without needing an index variable. It's often used for its simplicity and readability when you need to access each element directly.
//
//Breakdown of the Loop
//for (int value : b):
//
//This initializes a loop where each element of the array b is accessed in sequence.
//int value is the loop variable that will take on the value of each element in the array b one at a time.
//b is the array being iterated over.
//        System.out.print(value + " "):
//
//Inside the loop body, System.out.print(value + " ") prints the current element (value) followed by a space.
//This continues for each element in the array b until all elements have been printed.
//Example with Explanation
//Given an array b = {2, 4, 6}, let's see how the for-each loop works step-by-step:
//
//First Iteration:
//
//value takes the first element of b, which is 2.
//        System.out.print(value + " ") prints 2 .
//Second Iteration:
//
//value takes the second element of b, which is 4.
//        System.out.print(value + " ") prints 4 .
//Third Iteration:
//
//value takes the third element of b, which is 6.
//        System.out.print(value + " ") prints 6 .
