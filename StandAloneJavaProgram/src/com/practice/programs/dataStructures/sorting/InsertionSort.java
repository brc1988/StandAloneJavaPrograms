package com.practice.programs.dataStructures.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author choudhuryb
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] input = {1, 7, 3, 4, 3, 9, 4};
        sort(input);
    }

    private static void sort(int[] input) {
        display(input);
        int totalSteps = 0;
        
        for (int i = 1; i < input.length; i++) {            
            int j=i;
            int val= input[j];
            while(j>0 && input[j-1]>val){
              input[j] = input[j-1];         
            j--;
            
            }
            input[j] = val;   
            display(input);
        }       

    }

    private static void display(int[] input) {
        for (Integer i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
