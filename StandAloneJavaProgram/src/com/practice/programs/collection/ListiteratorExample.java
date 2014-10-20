package com.practice.programs.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 *
 * @author choudhuryb
 */
public class ListiteratorExample {
    
     public static void main(String[] arg) {
         List list = new ArrayList();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         
         ListIterator itr =  list.listIterator();
         
         while(itr.hasNext()){
         System.out.println(itr.next());
         }
         System.out.println("Now print previos way");
         while(itr.hasPrevious()){
         System.out.println(itr.previous());
         }
         
     
     }
     
    
}
