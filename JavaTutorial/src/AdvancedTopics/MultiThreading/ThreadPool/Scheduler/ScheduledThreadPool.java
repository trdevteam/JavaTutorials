package AdvancedTopics.MultiThreading.ThreadPool.Scheduler;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import AdvancedTopics.MultiThreading.ThreadPool.ExecutorService.WorkerThread;

public class ScheduledThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		
		
		//schedule to run after sometime
		System.out.println("Current Time = "+new Date());
		for(int i=0; i<5; i++){
//			Thread.sleep(1000);
			WorkerThread worker = new WorkerThread("do heavy processing");
			scheduledThreadPool.schedule(worker, 1, TimeUnit.SECONDS);
		}
		
		//add some delay to let some threads spawn by scheduler
//		Thread.sleep(1000);
		
		scheduledThreadPool.shutdown();
		while(!scheduledThreadPool.isTerminated()){
			//wait for all tasks to finish
		}
		System.out.println("Finished all threads");
	}

}