package test.run;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import mycallable.MyRunnable;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {

		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
				1);

		Runnable runnable1 = new MyRunnable("A");
		Runnable runnable2 = new MyRunnable("B");

		ScheduledFuture future1 = executor.scheduleAtFixedRate(runnable1, 0, 2,
				TimeUnit.SECONDS);
		Thread.sleep(1000);
		ScheduledFuture future2 = executor.scheduleAtFixedRate(runnable2, 10,
				2, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println(executor.remove((Runnable) future2));
		System.out.println("");

		BlockingQueue<Runnable> queue = executor.getQueue();
		Iterator<Runnable> iterator = queue.iterator();
		while (iterator.hasNext()) {
			Runnable runnable = (Runnable) iterator.next();
			System.out.println("队列中的：" + runnable);
		}

	}
}
