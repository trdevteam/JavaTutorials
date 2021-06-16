package AdvancedTopics.MultiThreading.App12Callable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

	int pid = 0;
	public MyCallable(int pid) {
		this.pid = pid;		
	}
	
    @Override
    public String call() throws Exception {
        Thread.sleep(10);
        //return the thread name executing this callable task
        String str = "";
        if(pid%3==0)
        	str = pid + " başarılı";
        if(pid%3==1)
        	str = pid + " başarısız";
        if(pid%3==2)
        	str = pid + " hatalı";
        return str;
    }
    
    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable instance
     
        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
        	Callable<String> callable = new MyCallable(Math.abs(new Random().nextInt()));
            Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println( ":get:"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        System.out.println("");
        executor.shutdown();
    }

}