package com.practice.programs.enumExamples;

/**
 *
 * @author choudhuryb
 */
class AnimalKingdom {
// you can put enum inside another class , but you see how it is called
    enum Animals {
        DOG, CAT, ELEPHANT, PANDA, RED_PANDA
    }
}

public class EnumBasicFlavour3 {

    public static void main(String[] args) {
        System.out.println("Animal : " + AnimalKingdom.Animals.DOG);
        System.out.println("Animal : " + AnimalKingdom.Animals.valueOf("DOG"));
    }
}
