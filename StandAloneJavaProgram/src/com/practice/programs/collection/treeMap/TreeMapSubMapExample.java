package com.practice.programs.collection.treeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author choudhuryb
 */
public class TreeMapSubMapExample {

    public static void main(String[] arg) {

        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("SuperMan", "SuperMan");
        map.put("BatMan", "BatMan");
        map.put("CatWoman", "CatWoman");
        map.put("IronMan", "IronMan");
        map.put("Thor", "Thor");
        map.put("CaptainAmerica", "CaptainAmerica");

        System.out.println(map);

        Map submap = map.subMap("CatWoman", true, "IronMan", true);
        System.out.println(submap);        
        
        //Adding a entry to submap also add the entry to parent map
        submap.put("HarryPotter", "HarryPotter");
        System.out.println(map);
        System.out.println(submap);
        
        //dont try to put (key,value) outside scope of the submap. u will get error
        
        map.put("Xander", "Xander");
        System.out.println(map);
        System.out.println(submap);

    }
}
