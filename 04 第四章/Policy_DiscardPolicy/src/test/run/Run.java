package test.run;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName()
							+ " run end!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ArrayBlockingQueue queue = new ArrayBlockingQueue(2);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, queue, new ThreadPoolExecutor.DiscardPolicy());
		executor.execute(runnable);// 1
		executor.execute(runnable);// 2
		executor.execute(runnable);// 3
		executor.execute(runnable);// 4
		executor.execute(runnable);// 5
		executor.execute(runnable);// 6
		executor.execute(runnable);// 7
		executor.execute(runnable);// 8
		Thread.sleep(20000);
		System.out.println(executor.getPoolSize() + " " + queue.size());
	}

}
