package test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class getCompletedTaskCount_test1 {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 100,
				TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		System.out.println(executor.getCompletedTaskCount());
		Thread.sleep(7000);
		System.out.println(executor.getCompletedTaskCount());
	}
}
