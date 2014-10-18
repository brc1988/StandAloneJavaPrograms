package com.practice.programs.dataStructures.sorting;

import java.util.LinkedList;

/**
 *
 * @author choudhuryb
 */
public class RadixSort {

   
    
    LinkedList [] list = new LinkedList [] {
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>(),
        new LinkedList<Integer>()    
    };
     private void radixSort(int[] a, int maxNoDigit) {
         
         int dev=1;
        int mod =10;
        for(int i=0;i< maxNoDigit;i++,dev*=10,mod*=10){
        
            for(int j=0;j<a.length;j++){
            int bucket = (a[j]%mod)/dev;
            list[bucket].add(a[j]);
            System.out.println("putting "+a[j]+" into bucket "+ bucket);
            }            
            int pos= 0;
            for(int k=0;k<list.length;k++){
            Integer value= null;
            while((value = (Integer)list[k].poll())!=null){
                System.out.println("position "+pos+ "---> "+ value);
                a[pos++]=value;
            }        
            }         
        }     
    }
    
    public static void main(String [] args){
     int [] a = new int []{2, 30, 950, 300, 76};    
     new RadixSort().radixSort(a, 3);
     
    } 
    
}
