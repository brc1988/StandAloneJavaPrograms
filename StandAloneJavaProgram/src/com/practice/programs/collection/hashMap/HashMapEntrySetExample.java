package com.practice.programs.collection.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Entry can be used to get values from map as shown below
 *
 * @author choudhuryb
 */
public class HashMapEntrySetExample {

    public static void main(String[] arg) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "Dog");
        map.put("2", "Penguin");
        map.put("3", "Sloth");
        map.put("4", "Koala");
        map.put("5", "Panda");
        map.put("6", "RedPanda");

        System.out.println(map);

        Set<Entry<String, String>> entrys = map.entrySet();
        for (Entry e : entrys) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }
}
