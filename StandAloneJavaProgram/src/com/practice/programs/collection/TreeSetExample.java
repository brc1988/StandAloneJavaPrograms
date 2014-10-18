package com.practice.programs.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Tree set is sorted set
 * null values can not be added
 * @author choudhuryb
 */
public class TreeSetExample {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();

        set.add("biswa");
        set.add("ranjan");
        set.add("choudhury");
//     remember set is about unique values. hence duplicate values wont be added
        set.add("choudhury");        
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
