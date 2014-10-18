package com.practice.programs.thread;

/**
 *
 * @author choudhuryb
 */
public class MyDaemonThread extends Thread{

    public MyDaemonThread() {
        //making thread Daemon
        setDaemon(true);
    }

    @Override
    public void run() {
       System.out.println("This is a Daemon thread Implementation");
       System.out.println("Thread is Daemon(true/false)  : "+ isDaemon());
    } 
    public static void main (String [] args){
        MyDaemonThread daemonThread  = new MyDaemonThread();
        
        //This way also a thread can b made daemon
        //daemonThread.setDaemon(true);
        daemonThread.start();
        
    }
    
}
