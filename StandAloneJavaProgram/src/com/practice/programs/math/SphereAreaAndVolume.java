package com.practice.programs.math;

import java.util.Scanner;

/**
 * Simple Program to calculate Area and Volume of Sphere
 *
 * Oct 11, 2014
 */
public class SphereAreaAndVolume {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a radius of Sphere: ");
        double r = sc.nextDouble();
        System.out.println("Area   : " + (4 * Math.PI * Math.pow(r, 2)));
        System.out.println("Voulme : " + ((4 * Math.PI * Math.pow(r, 3))) / 3);
    }
}
