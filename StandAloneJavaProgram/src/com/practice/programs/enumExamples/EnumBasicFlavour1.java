package com.practice.programs.enumExamples;

/**
 *
 * @author choudhuryb
 */

// you can put enum outside class 
enum Chacolate {
   KITKAT, LINDT, CHOKOLA  
}
public class EnumBasicFlavour1 {
    public static void main(String[] args) {
        System.out.println("Animal : " + Chacolate.KITKAT);
        System.out.println("Animal : " + Chacolate.valueOf("KITKAT"));        
    }
}

