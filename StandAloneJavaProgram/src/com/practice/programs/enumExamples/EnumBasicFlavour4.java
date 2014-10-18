package com.practice.programs.enumExamples;

/**
 *
 * @author choudhuryb
 */
 
//check below , where you place constructor matters !!!!!!!
enum Animal {
 DOG(1), CAT(2), ELEPHANT(3), PANDA(4), RED_PANDA(5);
    int id;

    public int getId() {
        return id;
    }

    private Animal(int id) {
        this.id = id;
    } 
   
}
public class EnumBasicFlavour4 {

    public static void main(String[] args) {
        System.out.println("Animal    : " + Animal.DOG);
        System.out.println("Animal    : " + Animal.valueOf("DOG"));
        System.out.println("Animal ID : " + Animal.DOG.getId());
    }
}
