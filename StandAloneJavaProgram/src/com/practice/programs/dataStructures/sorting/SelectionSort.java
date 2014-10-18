package com.practice.programs.dataStructures.sorting;

/**
 *
 * @author choudhuryb
 */
public class SelectionSort {

    public static void main(String[] arg) {
        int[] a = {100, 78, 34, 6, 7, 456, 45, 67, 872, 56, 7};
        //int[] a = {5, 78, 34, 6, 7, 27, 45, 67, 872, 56};
        new SelectionSort().selectionSort(a);
        System.out.println("Result :");
        new SelectionSort().display(a);

    }

    private void selectionSort(int[] a) {
        int index;
        for (int i = 0; i < a.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            System.out.println("smallest :" + a[index]);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
            display(a);

        }

    }

    private void display(int[] a) {
        for (int x : a) {
            System.out.print(x + "  ");
        }
        System.out.println();

    }
}
