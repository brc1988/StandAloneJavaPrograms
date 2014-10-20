package com.practice.programs.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author choudhuryb
 */
public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Biswa");
        map.put("2", "Ranjan");
        map.put("3", "Choudhury");
        //remember HashMap allows one null as key, and multiple values as null
        map.put(null, "Choudhury");
        map.put("4", null);
        map.put("5", null);       

        Set s = map.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            String key = (String) itr.next();
            System.out.println("Key : " + key + "   value : " + map.get(key));
        }    
    }
}
