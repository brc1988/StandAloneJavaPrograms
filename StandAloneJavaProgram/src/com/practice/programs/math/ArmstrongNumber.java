package com.practice.programs.math;

import java.util.Scanner;



/**
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class ArmstrongNumber {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args){
        
        System.out.println("Enter upper limit to find Armstrong Number");
        
        int upperlimit = sc.nextInt();
        
        for(int i=0; i<upperlimit; i++){
            boolean armstrong = checkArmstrong(i);
            
            if(armstrong){
            System.out.println(i);
            }        
        }     
    }

    private static boolean checkArmstrong(int input) {
        String inputString = input+"";
        int length = inputString.length();
        int sum = 0;
        int number = input;
       
        while(input>0){
            int digit = input%10;
            sum = (int) (sum + Math.pow(digit, length));
            input=input/10;        
        }
        if(number==sum){
        return true;
        }else{
        return false;
        }     
    } 
}
