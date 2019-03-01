package test.run;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import mycallable.MyRunnable;

public class Run1 {
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				10);
		Runnable runnable1 = new MyRunnable("A");
		executor.scheduleAtFixedRate(runnable1, 1, 2, TimeUnit.SECONDS);
		executor.shutdown();
		System.out.println("÷¥––¡Àshutdown!");
	}
}
