package com.practice.programs.dataStructures.sorting;

/**
 *
 * @author choudhuryb
 */
public class MergeSort {

    int[] array;
    int[] tempArray;

    public static void main(String[] arg) {
        int[] a = {5, 78, 34, 6, 7, 456, 45, 67, 872, 56, 7};
        //int[] a = {5, 78, 34, 6, 7, 27, 45, 67, 872, 56};
        new MergeSort().sort(a, 0, a.length);

    }

    private void sort(int[] a, int i, int length) {
        array = a;
        display(array);
        tempArray = new int[array.length];
        mergeSort(0, array.length-1);

    }

    private void mergeSort(int low, int high) {
        System.out.println("low : " + low + " high : " + high);
        if (low < high) {
            int middle = low + (high - low) / 2;
            System.out.println("middle " + middle);
            //System.out.println("mergeSort(low, middle);");        
            mergeSort(low, middle);
            //System.out.println("mergeSort(middle+1, high);");
            mergeSort(middle + 1, high);
            merge(low, middle, high);


        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;

        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
        System.out.println("tempArray");
        display(tempArray);
        System.out.println("array");
        display(array);



    }

    private void display(int[] a) {
        for (int x : a) {
            System.out.print(x + "  ");
        }
        System.out.println();

    }
}
