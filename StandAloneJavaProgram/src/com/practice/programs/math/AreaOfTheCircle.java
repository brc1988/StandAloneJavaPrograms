package com.practice.programs.math;

import java.util.Scanner;

/**
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class AreaOfTheCircle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter Radius");
        double radius = sc.nextDouble();
        double area = Math.PI * radius;
        System.out.println("area"+area);       
    }
    
}
