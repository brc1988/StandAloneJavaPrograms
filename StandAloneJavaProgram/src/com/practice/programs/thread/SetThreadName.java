package com.practice.programs.thread;
/**
 *
 * @author choudhuryb
 */
public class SetThreadName extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("Thread name : " + getName());
    }
    
    public static void main(String [] args){        
        Thread t1 = new SetThreadName(); 
        t1.setName("Biswa Thread");
        Thread t2 = new SetThreadName(); 
        t2.setName("Ranjan Thread"); 
        t1.start();
        t2.start();
    }
    
}
