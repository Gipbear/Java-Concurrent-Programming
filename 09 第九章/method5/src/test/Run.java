package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Run {

	public static void main(String[] args) {
		try {
			ForkJoinPool pool = new ForkJoinPool();
			System.out.println("begin " + System.currentTimeMillis());
			ForkJoinTask task = pool.submit(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(5000);
						System.out.println("ThreadName="
								+ Thread.currentThread().getName());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			System.out.println(task.get());
			System.out.println("  end " + System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
