package com.practice.programs.math;

import java.util.Scanner;

/**
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class DecimalToHexaDecimalConversion {
	static Scanner sc = new Scanner(System.in) ;

	public static void main(String[] args) {
		System.out.println("Enter a Decimal number : ");
        int number = sc.nextInt();
        
        char [] c = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String result = "";
        int reminder;
        
        while(number!=0){
        	reminder = number%16;
        	
        	//note: floor(double a)
            //Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.
            //int x = (int)Math.floor(number/16);
            System.out.println(reminder);
            result = c[reminder]+result;
            number= number/16;
            }
        
        System.out.println("Hex Value : "+ result); 
       

	}

}
