package test.run;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import mycallable.MyRunnable;

public class Run1 {
	public static void main(String[] args) throws InterruptedException {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				1);
		Runnable runnable1 = new MyRunnable("A");
		Runnable runnable2 = new MyRunnable("B");
		executor.schedule(runnable1, 3, TimeUnit.SECONDS);
		executor.shutdown();
		System.out.println("“—æ≠shutdown¡À");
	}
}
