package com.practice.programs.thread;

/**
 *
 * @author choudhuryb
 */
public class InterruptThread extends Thread{
    @Override
    public void run() {
        System.out.println("Inside Run Thread state : " + getState());
        try {
            System.out.println("About to sleep 3000ms inside run");
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
           System.out.println("Exception : " + ex.getMessage());
        }

    }
     public static void main(String[] args) {

        Thread myThread = new InterruptThread();
        System.out.println("Thread state : " + myThread.getState());

        myThread.start();
        myThread.interrupt();
        
     }
    
}
