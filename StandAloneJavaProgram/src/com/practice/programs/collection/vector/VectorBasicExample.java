package com.practice.programs.collection.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author choudhuryb
 */
public class VectorBasicExample {

    public static void main(String[] arg) {
        Vector vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        
        //Using Iterator
        Iterator itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        //Using Enumeration
        System.out.println("Using Enumeration");
        Enumeration enm = vector.elements();
        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }

    }
}
