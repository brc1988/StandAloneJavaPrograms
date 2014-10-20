package com.practice.programs.collection.hashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author choudhuryb
 */
public class HashMapSortByValues {
      public static void main(String[] args) {
       Map <String,String> map = new HashMap <String, String>();
        map.put("1","Dog");
        map.put("2","Penguin");
        map.put("3","Sloth");
        map.put("4","Koala");
        map.put("5","Panda");
        map.put("6","RedPanda");
        
        System.out.println(map);
        CustomComapator comparator = new CustomComapator(map);
        
         Map <String,String> treeMap = new TreeMap <String, String>(comparator);
         treeMap.putAll(map);
         
         System.out.println(treeMap);   
      
      }
    
}

class CustomComapator implements Comparator{
    
    Map<String,String> comparatorMap;

    public CustomComapator(Map<String, String> comparatorMap) {
        this.comparatorMap = comparatorMap;
    } 

    @Override
    public int compare(Object o1, Object o2) {
          return (comparatorMap.get((String)o1).compareTo (comparatorMap.get((String)o2)));
    }
}