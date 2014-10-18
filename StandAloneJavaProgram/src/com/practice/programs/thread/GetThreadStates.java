package com.practice.programs.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Thread states
 * NEW           : A thread that has not yet started is in this state.
 * RUNNABLE      : A thread executing in the Java virtual machine is in this state.
 * BLOCKED       : A thread that is blocked waiting for a monitor lock is in this state.
 * WAITING       : A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
 * TIMED_WAITING : A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
 * TERMINATED    : A thread that has exited is in this state.
 * 
 * @author choudhuryb
 */
public class GetThreadStates extends Thread {

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

        GetThreadStates myThread = new GetThreadStates();
        System.out.println("Thread state : " + myThread.getState());

        myThread.start();
        System.out.println("Thread state : " + myThread.getState());
        try {
            System.out.println("About to sleep 1000ms");
            myThread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Exception : " + ex.getMessage());
        }
        System.out.println("Thread state : " + myThread.getState());

        try {
            System.out.println("About to sleep 2000ms");
            myThread.sleep(4000);
        } catch (InterruptedException ex) {
            System.out.println("Exception : " + ex.getMessage());
        }
        System.out.println("Thread state : " + myThread.getState());
        





    }
}
