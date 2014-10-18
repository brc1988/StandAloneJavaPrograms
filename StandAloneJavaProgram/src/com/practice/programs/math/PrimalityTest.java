package com.practice.programs.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author B R Choudhury
 * Oct 11, 2014
 */
public class PrimalityTest {    
    
    
    public static void main(String [] args){
    List <Integer> primaryNumbers;
    
    primaryNumbers = getPrimaryNumbars(100);
     for(Integer i: primaryNumbers){
        System.out.print(i+ " ");
     }
        
    }

    private static List<Integer> getPrimaryNumbars(int upperLimit) {
       boolean [] b =new boolean[upperLimit];
       Arrays.fill(b,true);
        List <Integer> primaryNumbers= new ArrayList<Integer>();
       
       for(int i=2; i<upperLimit; i++){
       if(b[i])
       primaryNumbers.add(i);
       for(int j=i; j*i< upperLimit; j++)
           b[j*i]=false;
       }
       return primaryNumbers;
    }
}
