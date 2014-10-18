package com.practice.programs.enumExamples;

/**
 *
 * @author choudhuryb
 */
public class EnumBasicFlavour2 {
// you can put enum inside class 
    enum Animals {

        DOG, CAT, ELEPHANT, PANDA, RED_PANDA
    }

    public static void main(String[] args) {
        System.out.println("Animal : " + Animals.DOG);
        System.out.println("Animal : " + Animals.valueOf("DOG"));
    }
}
