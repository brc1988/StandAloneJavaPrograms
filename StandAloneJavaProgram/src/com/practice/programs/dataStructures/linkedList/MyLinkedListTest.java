package com.practice.programs.dataStructures.linkedList;
/**
 *
 * @author choudhuryb
 */
public class MyLinkedListTest {
    
    public static void main(String [] args){
        
        MyLinkedList list = new MyLinkedList();
        list.display();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        
         list.insertAtPosition(60,1);
         list.display();
         //remove at begining
         list.remove();
         list.display();
         //remove at last by giving last position to delete
         list.removeAtPosition(4);
         list.display(); 
    }
    
}
