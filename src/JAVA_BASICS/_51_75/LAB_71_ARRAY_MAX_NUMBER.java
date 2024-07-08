package JAVA_BASICS._51_75;

public class LAB_71_ARRAY_MAX_NUMBER {
    public static void main(String[] args) {
        int[] a = {10,2,3,4,50};
        int b = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i]> b){
                b=a[i];
            }}
        System.out.println("MAXIMUM SALARY -->> " + b);
    }
}

//        public class MaxSalaryFinder {
//            public static void main(String[] args) {
//                // Define the input array
//                int[] salaries = {10, 20, 30, 40, 50};
//
//                // Initialize maxSalary with the first element of the array
//                int maxSalary = salaries[0];
//
//                // Iterate through the array to find the maximum salary
//                for (int i = 1; i < salaries.length; i++) {
//                    if (salaries[i] > maxSalary) {
//                        maxSalary = salaries[i];
//                    }
//                }
//
//                // Print the maximum salary found
//                System.out.println("The maximum salary is: " + maxSalary);
//            }
//        }
//        Explanation:
//        Array Initialization:
//
//        int[] salaries = {10, 20, 30, 40, 50}; initializes an integer array salaries with the values {10, 20, 30, 40, 50}.
//        Finding Maximum Salary:
//
//        int maxSalary = salaries[0]; initializes maxSalary with the first element of the salaries array.
//        Iterating through the Array:
//
//        The for loop for (int i = 1; i < salaries.length; i++) { ... } iterates through the array starting from index 1 (since maxSalary is already initialized with salaries[0]).
//        Inside the loop, it checks if the current element salaries[i] is greater than maxSalary. If it is, maxSalary is updated to salaries[i].
//        Output:
//
//        System.out.println("The maximum salary is: " + maxSalary); prints out the maximum salary found after iterating through the array.
