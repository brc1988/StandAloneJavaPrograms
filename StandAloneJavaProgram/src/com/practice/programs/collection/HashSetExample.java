package com.practice.programs.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * remember set is about unique values. hence duplicate values wont be added
 * null can be added to HashSet
 * @author choudhuryb
 */
public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("biswa");
        set.add("ranjan");
        set.add("choudhury");
//     remember set is about unique values. hence duplicate values wont be added
        set.add("choudhury");
        set.add(null);
        
        display(set);
        set.remove("biswa");
        System.out.println("After removing biswa");
        display(set);

        System.out.println("Check Set contains ranjan : " + set.contains("ranjan"));
    }

    public static void display(Set set) {
        System.out.println("Set  : " + set);
        System.out.println("size : " + set.size());

        Iterator itr = set.iterator();
        System.out.print("Values : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
    }
}
