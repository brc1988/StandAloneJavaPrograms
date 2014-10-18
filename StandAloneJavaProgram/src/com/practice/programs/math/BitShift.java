package com.practice.programs.math;

import java.util.Scanner;

/**
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class BitShift {
    static Scanner sc = new Scanner(System.in) ;
    public static void main(String [] args){
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter a bit to shift(example : 2) : ");
        int bitToShift = sc.nextInt();
        
        int leftShiftResult = a<<bitToShift;
        int rightShiftResult = a>>bitToShift;
        
        System.out.println("Input              : " + a +" binary value : "+ Integer.toBinaryString(a));
        System.out.println("Output Left Shift  : " + leftShiftResult +" binary value : "+ Integer.toBinaryString(leftShiftResult));   
        System.out.println("Output Right Shift : " + rightShiftResult +" binary value : "+ Integer.toBinaryString(rightShiftResult));   
    }
    
}
