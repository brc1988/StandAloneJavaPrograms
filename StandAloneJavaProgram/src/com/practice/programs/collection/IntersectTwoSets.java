package com.practice.programs.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * use retainAll() method of AbstractCollection
 * @author choudhuryb
 */
public class IntersectTwoSets {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Crow");
        set1.add("Hen");
        set1.add("Duck");
        set1.add("RedPanda");

        Set<String> set2 = new HashSet<String>();
        set2.add("Dog");
        set2.add("Penguin");
        set2.add("Sloth");
        set2.add("Koala");
        set2.add("Panda");
        set2.add("RedPanda");
        
         Set<String> intersection = new HashSet<String>(set1);
         intersection.retainAll(set2);
         System.out.println("set1         : "+set1);
         System.out.println("set2         : "+set2);
         System.out.println("intersection : "+intersection);
        
    }
}
