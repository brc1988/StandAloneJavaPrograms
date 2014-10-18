package com.practice.programs.math;

import java.util.*;

/**
 *
 * @author choudhuryb
 */
public class MeanMedianModeRange {

    public static void main(String[] args) {
        int[] a = new int[]{13, 13, 13, 13, 14, 15, 18, 21, 10};
        findMean(a);
        findMedian(a);
        findMode(a);
        findRange(a);
    }

    private static void findMean(int[] a) {
        int sum = 0;
        for (int n : a) {
            sum = sum + n;
        }
        double mean = (double) (sum / a.length);

        System.out.println("Mean : " + mean);

    }

    private static void findMedian(int[] a) {
        double median;
        //for median always sort
        Arrays.sort(a);
        if ((a.length % 2) == 0) {
            median = (double) (a[(a.length / 2)] + a[(a.length / 2) + 1]) / 2.0;
        } else {
            median = a[(a.length / 2)];
        }
        System.out.println("Median : " + median);
    }

    private static void findMode(int[] a) {
        int frequency = 0;
        int highestFrequency = 0;
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> s = new TreeSet<Integer>();
        List<Integer> modes = new ArrayList<Integer>();
        //take only unique values
        for (int n : a) {
            s.add(n);
            list.add(n);
        }
        System.out.println("TreeSet : " + s);

        for (Integer x : s) {
            frequency = Collections.frequency(list, x);
            if (frequency == highestFrequency) {
                modes.add(x);
            }
            if (frequency > highestFrequency) {
                modes.clear();
                highestFrequency = frequency;
                modes.add(x);
            }
        }

        System.out.println("Mode : " + modes);
    }

    /**
     * range = maxValue-minValue
     *
     * @param a
     */
    private static void findRange(int[] a) {
        Arrays.sort(a);

        int range = a[a.length - 1] - a[0];
        System.out.println("Range : " + range);


    }
}
