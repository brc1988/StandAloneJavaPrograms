package com.practice.programs.collection.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * remember when you use object as key, 
 * then you must override objects hashCode() and equals() method 
 * @author choudhuryb
 */
public class LinkedHashMapDeleteObjectExample {

    public static void main(String[] arg) {

        Map<AnimalDetails, String> map = new LinkedHashMap<AnimalDetails, String>();
        
        map.put(new AnimalDetails("brown", "domestic"), "dog");
        map.put(new AnimalDetails("gray", "domestic"), "elephant");
        map.put(new AnimalDetails("yellow", "wild"), "tiger");
        map.put(new AnimalDetails("black", "wild"), "crow");
        
        System.out.println(map);
        System.out.println("map.containsKey(new AnimalDetails(\"black\", \"wild\"))"+map.containsKey(new AnimalDetails("black", "wild")));
        map.remove(new AnimalDetails("black", "wild"));
        System.out.println(map);
    }
}

class AnimalDetails {

    String colour;
    String catagory;

    public AnimalDetails(String colour, String catagory) {
        this.colour = colour;
        this.catagory = catagory;
    }
    public String toString(){
        return "("+colour+", "+catagory+")";
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnimalDetails other = (AnimalDetails) obj;
        if ((this.colour == null) ? (other.colour != null) : !this.colour.equals(other.colour)) {
            return false;
        }
        if ((this.catagory == null) ? (other.catagory != null) : !this.catagory.equals(other.catagory)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.colour != null ? this.colour.hashCode() : 0);
        hash = 83 * hash + (this.catagory != null ? this.catagory.hashCode() : 0);
        return hash;
    }
    
}
