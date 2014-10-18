package com.practice.programs.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



/**
 *
 * @author choudhuryb
 */
public class SceduleTask {
   static Timer timer = new Timer();
   static int counter= 0;
   
   public static class MyTask extends TimerTask{

        @Override
        public void run() {
            if(counter<4){
                counter++;
            System.out.println("Running MyTask at " +new Date());
            }else{
                System.out.println("Time to stop execution :"+new Date());
                timer.cancel();            
            }            
        }        
   }
    
    public static void main(String [] args){
        timer.schedule(new MyTask(), new Date(), 20000);          
    }
}
