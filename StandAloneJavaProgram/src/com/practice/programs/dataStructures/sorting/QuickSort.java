package com.practice.programs.dataStructures.sorting;
/**
 *
 * @author choudhuryb
 */
public class QuickSort {

    int[] numbers;

    public static void main(String[] arg) {
        int[] a = {5, 78, 34, 6, 7, 456, 45, 67, 872, 56, 7};
        //int[] a = {5, 78, 34, 6, 7, 27, 45, 67, 872, 56};
        new QuickSort().sort(a, 0, a.length);

    }

    public void sort(int[] a, int low, int high) {
        numbers = a;
         display();        
        quickSort(0, (numbers.length-1));
    }

    public void quickSort(int low, int high) {
        int i = low;
        int j = high;
        int pivote = numbers[(i + ((j - i) / 2))];
        System.out.println("lower index : " +i+" and higher index : "+j +" pivote :" + pivote);       
        while (i <= j) {

            while (numbers[i] < pivote) {
                i++;
            }
            while (numbers[j] > pivote) {
                j--;
            }
            if (i <= j) {
                System.out.println("exchange "+ numbers[i]+"  "+numbers[j] );
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;               
                i++;
                j--;
            }
            display();
        }
        System.out.println("i    : "+i+" j    : "+j);
        System.out.println("high : "+high+" low : "+low);
        if (i < high) {
            System.out.println("i < high");
            quickSort(i, high);
        }
         if (low <j) {
             System.out.println("low <j");
            quickSort(low, j);
        }     
    }

    private void display() {
        
        for (int x : numbers) {
            System.out.print(x+"  ");
        }
        System.out.println();
        
    }
}
