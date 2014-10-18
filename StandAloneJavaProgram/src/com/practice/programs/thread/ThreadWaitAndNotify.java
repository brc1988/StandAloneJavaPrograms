package com.practice.programs.thread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author choudhuryb
 */
public class ThreadWaitAndNotify {

    private List<String> syncList;

    public ThreadWaitAndNotify() {
        //See how list is made synchrinized using Collections
        syncList = Collections.synchronizedList(new LinkedList());
    }

    public void add(String s) {
        synchronized (syncList) {
            syncList.add(s);
            System.out.println(s + " is added to list");
            System.out.println("Now notify others");
            //notify();
            syncList.notifyAll();
        }
    }

    public String remove() {
        String s = "";
        synchronized (syncList) {
            if (syncList.isEmpty()) {
                System.out.println("List is empty so wait()....");
                try {
                  syncList.wait();
                } catch (InterruptedException ex) {
                    System.err.println("Error " + ex.getMessage());
                }
            } else {
                s = syncList.remove(0);
                System.out.println(s + " is removed");
            }            
            return s;
        }
    }

    public static void main(String[] s) {
        //create class object
        //see obj is maid final ..so that it can be accessed inside inner class
        final ThreadWaitAndNotify obj = new ThreadWaitAndNotify();

        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                String s = obj.remove();
            }
        };
        Runnable r2 = new Runnable() {

            @Override
            public void run() {
                obj.add("Hi");
            }
        };

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r2, "B");
        Thread t3 = new Thread(r1, "C");

        t1.start();
        t3.start();
        t2.start();
        

    }
}
