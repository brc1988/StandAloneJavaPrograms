package com.practice.programs.math;

import java.util.Scanner;

/**
 * Floyd's triangle
 * 
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 11 12 13 14 15 
 * 16 17 18 19 20 21 
 * 22 23 24 25 26 27 28 
 * 29 30 31 32 33 34 35 36
 * ----------------------------
 * 
 * @author choudhuryb
 */
public class FloydsTriangle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Number of rows : ");
        int a = sc.nextInt();
        int j = 1;
        for (int i = 0; i < a; i++) {
            for (int counter = 0; counter <= i; counter++) {
                System.out.print(j++ + " ");
            }
            System.out.println();
        }
    }
}
