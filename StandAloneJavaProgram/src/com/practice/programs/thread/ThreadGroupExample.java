package com.practice.programs.thread;
/**
 * 
 * Thread group contains set of threads and/or other thread group
 *
 * @author choudhuryb
 */
public class ThreadGroupExample {

    public static void main(String [] args) {

        ThreadGroup tParentGroup = new ThreadGroup("Parent Thread Group");
        Thread t1 = new Thread(tParentGroup, "t1");
        Thread t2 = new Thread(tParentGroup, "t2");
        Thread t3 = new Thread(tParentGroup, "t3");
        Thread t4 = new Thread(tParentGroup, "t4");
        Thread t5 = new Thread(tParentGroup, "t5");
        
        t1.start();
        t2.start();
        t3.start();        
        System.out.println(tParentGroup.activeCount());
        
        
        ThreadGroup tChildGroup = new ThreadGroup(tParentGroup, "Child Thread Group");
        Thread c1 = new Thread(tChildGroup, "c1");
        Thread c2 = new Thread(tChildGroup, "c2");
        Thread c3 = new Thread(tChildGroup, "c3");
        
        c3.start(); 
        System.out.println(tChildGroup.activeCount());
        System.out.println(tParentGroup.activeGroupCount());
        

    }
}
