package com.practice.programs.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author choudhuryb
 */
public class SysnchronizedMethodExample extends Thread {

    private Print print;

    public SysnchronizedMethodExample(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
//        synchronized (print) {
//            print.printCount();
//        }
         print.printCount();
    }

    public static void main(String[] args) {
        Print p = new Print();
        Thread t1 = new SysnchronizedMethodExample(p);
        Thread t2 = new SysnchronizedMethodExample(p);
        t1.start();
        //t1.join();
        t2.start();


    }
}

class Print {

    public synchronized void printCount() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("Error : " + ex.getMessage());
            }
        }
    }
}
