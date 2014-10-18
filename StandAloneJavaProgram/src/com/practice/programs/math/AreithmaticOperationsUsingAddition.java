package com.practice.programs.math;


/**
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class AreithmaticOperationsUsingAddition {

    public static void main(String[] arg) {

        multiplication(10, 5);
        subtraction(10, -5);
        division(10, 5);
    }

    private static void multiplication(int a, int b) {
        if ((a > 0 && b > 0) || (a < 0 && b < 0)){  
            
            
        
    }else{
}


        System.out.println ("Multiplication Result : ");

    }

    private static void subtraction(int a, int b) {
        int result = a + negate(b);
        System.out.println("subtraction Result : " + result);
    }

    private static void division(int a, int b) {



        int result = 0;
        System.out.println("division Result : " + result);

    }

    private static int negate(int b) {

        int d = (b > 0) ? -1 : 1;
        int n = 0;
        while (b != 0) {
            n = n + d;
            if (b > 0) {
                b--;
            }
            if (b < 0) {
                b++;
            }
        }

        System.out.println("negate Result : " + n);
        return n;
    }
}
