package com.practice.programs.enumExamples;

/**
 *
 * @author choudhuryb
 */

// you can put enum outside class 
enum Birds {
    DUCK{        

        @Override
        public String toString() {
            return "I M DUCK";
        }
    
    }, SWAN{     

        @Override
        public String toString() {
            return "I M SWAN";
        }
    }
    
    , BIRDS_OF_PARADISE{

       

        @Override
        public String toString() {
            return "I M BIRDS_OF_PARADISE";
        }
    };
}
public class EnumBasicFlavour5 {
    public static void main(String[] args) {
        System.out.println("Animal : " + Birds.DUCK);
        System.out.println("Animal : " + Birds.valueOf("DUCK"));        
    }
}

