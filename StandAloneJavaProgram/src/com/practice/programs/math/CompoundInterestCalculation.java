package com.practice.programs.math;

import java.util.Scanner;

/**
 * Class to calculate compound Interest
 *
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class CompoundInterestCalculation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a Princpal Amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter a Year : ");
        double year = sc.nextDouble();
        System.out.println("Enter a rate of Interest(in pecentage exp : 10): ");
        double rate = sc.nextDouble();

        double total = principal * Math.pow(1 + (rate / 100), year);

        System.out.println("Total Amount to be paid : " + total);

    }
}
