package com.practice.programs.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections.addAll()
 * Adds all of the specified elements to the specified collection. Elements to
 * be added may be specified individually or as an array. The behavior of this
 * convenience method is identical to that of c.addAll(Arrays.asList(elements)),
 * but this method is likely to run significantly faster under most
 * implementations.
 *
 * @author choudhuryb
 */
public class CollectionsAddAll {

    public static void main(String[] arg) {

        List list = new ArrayList();
        list.add("Dog");
        list.add("Penguin");
        list.add("Sloth");
        list.add("Koala");
        list.add("Panda");
        list.add("RedPanda");

        System.out.println(list);
        
        Collections.addAll(list, "Crow", "BirdOfParadise");        
        System.out.println(list);
        
        String [] stringArray ={"Cow", "Cat"}; 
        
         Collections.addAll(list, stringArray); 
          System.out.println(list);

    }
}
