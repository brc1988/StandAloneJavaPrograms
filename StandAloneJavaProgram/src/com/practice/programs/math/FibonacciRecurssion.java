package com.practice.programs.math;

/**
 *
 * @author choudhuryb
 */
public class FibonacciRecurssion {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = fibonacci(i);
            System.out.print(total + ", ");
        }
    }

    private static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        } else {           
            return (fibonacci(i - 1) + fibonacci(i - 2));
        }
    }
}
