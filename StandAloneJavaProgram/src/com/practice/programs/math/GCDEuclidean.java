package com.practice.programs.math;

import java.util.Scanner;


/**
 *
 * @author choudhuryb
 */
public class GCDEuclidean {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args){
        System.out.println("Enter 2 Positive Integer : ");
        int a = sc.nextInt();
        int b = sc.nextInt();        
        findGCD(a, b);     
    }

    
    private static void findGCD(int a, int b) {
       int r = a%b;
       while(r!=0){       
           a=b;
           b=r;
           r=a%b;    
           System.out.println("a : "+ a+" b : "+b+" r :"+r );
       }         
      System.out.println("GCD : "+ b); 
}
}
