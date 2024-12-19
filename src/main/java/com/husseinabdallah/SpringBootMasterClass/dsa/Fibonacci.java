package com.husseinabdallah.SpringBootMasterClass.dsa;

public class Fibonacci {
//    algorithm
//    The two first Fibonacci numbers are 0 and 1, and the next Fibonacci number is always the sum of the two previous numbers,
//    so we get 0, 1, 1, 2, 3, 5, 8, 13, 21, ..
    // Below is the algorithm to create the 20 first Fibonacci numbers.
    // How it works:
    // Start with the two first Fibonacci numbers 0 and 1.
    // Add the two previous numbers together to create a new Fibonacci number.
    // Update the value of the two previous numbers.
    // Do point a and b above 18 times.


    // 1. Implementation Using a For Loop
    // It can be a good idea to list what the code must contain or do before programming it:
    // Two variables to hold the previous two Fibonacci numbers
    // A for loop that runs 18 times
    // Create new Fibonacci numbers by adding the two previous ones
    // Print the new Fibonacci number
    // Update the variables that hold the previous two fibonacci numbers

    public static void main(String[] args) {
        fibonacciIterative(20);
    }


    // first solution using a loop
    public static void fibonacciIterative(int n) {
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for(int fibo = 0; fibo < (n - 2); fibo++) {
            int nextValue = first + second;
            System.out.println(nextValue);
            first = second;
            second = nextValue;
        }
    }

}
