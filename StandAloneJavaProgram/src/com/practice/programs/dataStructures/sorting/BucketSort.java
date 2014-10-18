package com.practice.programs.dataStructures.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author choudhuryb
 */
public class BucketSort {

    public static void main(String[] args) {

        int[] input = {1, 7, 3, 4, 3, 9, 4};
        sort(input, 9);
    }

    public static void sort(int[] a, int maxVal) {
        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        display(bucket);


        for (int i = 0; i < a.length; i++) {
            ++bucket[a[i]];
        }

        display(bucket);

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                a[outPos++] = i;
            }
        }
        display(a);
    }

    private static void display(int[] input) {
        for (Integer i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
