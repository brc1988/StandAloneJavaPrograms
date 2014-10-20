package com.practice.programs.collection.treeMap;

import java.util.TreeMap;

/**
 *
 * @author choudhuryb
 */
public class TreeMapReverseOrder {

    public static void main(String[] arg) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("SuperMan", "SuperMan");
        map.put("BatMan", "BatMan");
        map.put("CatWoman", "CatWoman");
        map.put("IronMan", "IronMan");
        map.put("Thor", "Thor");
        map.put("CaptainAmerica", "CaptainAmerica");
        System.out.println(map);        
        System.out.println(map.descendingMap());
    }   
}
