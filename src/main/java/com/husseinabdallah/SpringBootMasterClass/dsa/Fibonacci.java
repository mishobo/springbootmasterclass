package com.husseinabdallah.SpringBootMasterClass.dsa;

public class Fibonacci {
    // algorithm
    // The two first Fibonacci numbers are 0 and 1, and the next Fibonacci number is always the sum of the two previous numbers,
    // so we get 0, 1, 1, 2, 3, 5, 8, 13, 21, ..
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

    //1. first solution using a loop
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

    //2. implementation using recursion.
    //  recursion is when a function calls itself.

     static int count = 2;

    public static void fibonacciRecursive(int first, int second) {
        if(count <= 19) {
            int nextValue = first + second;
            System.out.println(nextValue);
            first = second;
            second = nextValue;
            count+=1;
            fibonacciRecursive(first, second);
        }
    }

    // 3. Finding The nth Fibonacci Number Using Recursion
    // To find the nth Fibonacci number we can write code based on the mathematics formula for Fibonacci number n:
    // F(n)=F(n−1)+F(n−2)
    // This just means that for example the 10th Fibonacci number is the sum of the 9th and 8th Fibonacci numbers.
    // This formula uses a 0-based index. This means that to generate the 20th Fibonacci number, we must writeF(19).
    // When using this concept with recursion, we can let the function call itself as long as n is less than, or equal to, 1.


    public static int nThFibonacciValue(int n) {
        if(n <= 1){
            return n;
        } else {
            return (nThFibonacciValue(n-2) + nThFibonacciValue(n-1));
        }

    }

    public static int sumOfFibonacci(int n) {
        return 0;
    }


    public static void main(String[] args) {
        //fibonacciIterative(20);
//        System.out.println(0);
//        System.out.println(1);
//        fibonacciRecursive(0, 1);

        System.out.println(nThFibonacciValue(19));


    }

}
