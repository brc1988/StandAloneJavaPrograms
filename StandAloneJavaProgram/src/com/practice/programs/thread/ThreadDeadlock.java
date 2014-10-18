package com.practice.programs.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author choudhuryb
 */
public class ThreadDeadlock {
    
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    
    public static void main(String [] args){
        
    Thread t1 = new Thread (){           
            public void run() {
                synchronized(lock1){
                    System.out.println("Thread 1 holds lock 1");
                    try {
                        sleep(20000);
                    } catch (InterruptedException ex) {
                       System.err.println("Exception : " + ex.getMessage());
                    }
                    System.out.println("Thread 1 waiting for lock 2");
                    synchronized(lock2){
                          System.out.println("Thread 1 holds lock 1 & 2");                    
                    }                
                }                
            } 
    };
    Thread t2= new Thread (){           
            public void run() {
                synchronized(lock2){
                    System.out.println("Thread 2 holds lock 2");
                    try {
                        sleep(20000);
                    } catch (InterruptedException ex) {
                       System.err.println("Exception : " + ex.getMessage());
                    }
                    System.out.println("Thread 2 waiting for lock 1");
                    synchronized(lock1){
                          System.out.println("Thread 2 holds lock 1 & 2");                    
                    }                
                }                
            } 
    };
    
    t1.start();
    t2.start();
    
    }  
}
