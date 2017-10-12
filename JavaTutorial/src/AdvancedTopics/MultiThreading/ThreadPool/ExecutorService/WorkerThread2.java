package AdvancedTopics.MultiThreading.ThreadPool.ExecutorService;

import java.util.Date;

public class WorkerThread2 implements Runnable {
	  
    private String command;
    
    public WorkerThread2(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Starts worker2 at "  + new Date()+" - Command: "+command );
//    	System.out.println("Time is :" + new Date()); // Display current time
        processCommand();
        System.out.println(Thread.currentThread().getName()+" Ends worker2 at "  + new Date()+" - Command: "+command );
    }

    private void processCommand() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }
}