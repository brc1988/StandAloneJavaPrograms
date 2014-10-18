package com.practice.programs.dataStructures.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author choudhuryb
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] input = {1, 7, 3, 4, 3, 9, 4};
        sort(input);
    }

    private static void sort(int[] input) {
        display(input);
        int totalSteps = 0;
        int remaining = input.length - 1;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < remaining; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
                display(input);
                totalSteps++;
            }
            remaining--;
        }
        System.out.println("TotalSteps : " + totalSteps);

    }

    private static void display(int[] input) {
        for (Integer i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
