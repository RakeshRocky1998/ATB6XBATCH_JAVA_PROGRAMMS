package JAVA_BASICS._26_TO_50;

import java.util.Scanner;

public class LAB_31_PRIME_NUMBER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Closing the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Edge cases
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Eliminate multiples of 2 and 3

        }

        // Check divisibility from 5 to the square root of num
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

//Explanation:
//Import the Scanner Class:
//
//import java.util.Scanner; allows the use of the Scanner class for reading input from the user.
//Main Method:
//
//public static void main(String[] args): The main method where the program execution begins.
//Scanner scanner = new Scanner(System.in); initializes the Scanner object to read input from the standard input stream.
//System.out.print("Enter a number: "); prompts the user to enter a number.
//int number = scanner.nextInt(); reads the input number as an integer.
//The if (isPrime(number)) statement checks if the entered number is prime using the isPrime method.
//scanner.close(); closes the Scanner object to free up resources.
//isPrime Method:
//
//public static boolean isPrime(int num): A method that returns true if num is a prime number and false otherwise.
//Edge Cases:
//if (num <= 1): Numbers less than or equal to 1 are not prime.
//if (num <= 3): Numbers 2 and 3 are prime.
//if (num % 2 == 0 || num % 3 == 0): Eliminate multiples of 2 and 3.
//Check Divisibility:
//The loop for (int i = 5; i * i <= num; i += 6) checks divisibility from 5 to the square root of num, skipping even numbers and multiples of 3.
//if (num % i == 0 || num % (i + 2) == 0): Checks if num is divisible by i or i + 2.
//This program efficiently checks if a number is prime by reducing the number of checks needed and encapsulates the logic in a reusable method.

//The `for` loop `for (int i = 5; i * i <= num; i += 6)` is used to iterate through potential factors of the number `num` to check if it is prime. Let's break down how this loop works:
//
//- **Initialization:** `int i = 5;` initializes the loop variable `i` to 5. We start from 5 because we have already checked divisibility by 2 and 3 in the previous conditions.
//
//- **Condition:** `i * i <= num;` is the loop condition. It ensures that the loop continues as long as the square of `i` is less than or equal to `num`. This condition is used because if `num` is divisible by a factor greater than its square root, it would also be divisible by a factor smaller than its square root.
//
//- **Iteration:** `i += 6;` increments `i` by 6 in each iteration. This is because we are only checking numbers of the form 6k ± 1 to optimize the process. This is because all integers can be represented as (6k + i) where i = [-1, 0, 1, 2, 3, 4] and k is an integer.
//
//- **Explanation:** We start from 5 (6 * 1 - 1) and check if `num` is divisible by 5 or 7 (6 * 1 + 1), then by 11 (6 * 2 - 1) and 13 (6 * 2 + 1), and so on. This is based on the fact that a prime number greater than 3 can be written in the form 6k ± 1 for some integer k.
//
//By using this approach, we can skip checking divisibility by even numbers and multiples of 3, reducing the number of iterations needed to determine if a number is prime.