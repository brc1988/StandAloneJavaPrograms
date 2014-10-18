package com.practice.programs.math;

import java.util.Scanner;

/**
 *
 * @author choudhuryb
 */
public class Factorial {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter A integer to find facotrial : ");
        int a = sc.nextInt();
        int result = factorial(a);
        System.out.println("Result :" + result);
    }

    private static int factorial(int a) {
        if (a == 1) {
            return 1;
        } else {
            return (a * factorial(a - 1));
        }
    }
}
