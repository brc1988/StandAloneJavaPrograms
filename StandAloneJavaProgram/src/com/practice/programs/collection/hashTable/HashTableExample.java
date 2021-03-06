package com.practice.programs.collection.hashTable;

import java.util.*;

/**
 *
 * @author choudhuryb
 */
public class HashTableExample {

    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<String, String> ();
        map.put("1", "Biswa");
        map.put("2", "Ranjan");
        map.put("3", "Choudhury");
//        remember Hashtable does not allow null key or value
//        map.put(null, "Choudhury");
//        map.put("4", null);
//        map.put("5", null);
       

        Set s = map.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            String key = (String) itr.next();
            System.out.println("Key : " + key + "   value : " + map.get(key));
        }    
    }
}
