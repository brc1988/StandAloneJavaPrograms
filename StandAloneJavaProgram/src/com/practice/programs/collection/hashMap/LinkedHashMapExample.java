package com.practice.programs.collection.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author choudhuryb
 */
public class LinkedHashMapExample {

    public static void main(String[] arg) {

        Map<String, String> map = new LinkedHashMap<String, String>();

        map.put("1", "Dog");
        map.put("2", "Penguin");
        map.put("3", "Sloth");
        map.put("4", "Koala");
        map.put("5", "Panda");
        map.put("6", "RedPanda");

        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + " : " + map.get(k));
        }

        //below one will return false as I passed a integer there
        System.out.println("map.containsKey(5) " + map.containsKey(5));
        System.out.println("map.containsKey(\"5\") : " + map.containsKey("5"));
        System.out.println("map.containsValue(\"Panda\") : " + map.containsValue("Panda"));
        System.out.println("map.remove(\"5\") : " + map.remove("5"));
        System.out.println("After removal :" + map);
    }
}
