package com.practice.programs.math;

import java.util.Scanner;

/**
 * The Collatz conjecture is a conjecture in mathematics named after Lothar Collatz, who first proposed it in 1937
 * 
 * If the number is even, divide it by two.
 * If the number is odd, triple it and add one.
 * keep on doing you will reach 1 at last
 * 
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class CollatzConjecture {
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a positive integer : ");
        int number = sc.nextInt();
        proof(number);
    }

    private static void proof(int number) {
        System.out.print(number + "  " );
        if(number==1){
        return;
        }else if(number%2 == 0){
        proof(number/2);
        }else{
        proof(3*number+1);
        }     
    }
}
