package com.practice.programs.thread;

/**
 *
 * @author choudhuryb
 */
public class MyThreadByExtendingThread extends Thread{

    public MyThreadByExtendingThread() {
    }    
    
    public void run(){
        System.out.println("This is my thread class by extending Thread class" );    
    }
    
    public static void main (String [] args){    
    new MyThreadByExtendingThread().start();    
    }
    
}
