package com.practice.programs.thread;
/**
 *
 * @author choudhuryb
 */
public class MyThreadByImplementingRunnable implements Runnable{

    @Override
    public void run() {
       System.out.println("This my thread using runnable interface" ); 
    }
    
    public static void main(String [] args){
        
        MyThreadByImplementingRunnable mythread = new MyThreadByImplementingRunnable();
        
        Thread t = new Thread(mythread);
        t.start();
    
    }
    
}
