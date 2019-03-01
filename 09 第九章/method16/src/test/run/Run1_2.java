package test.run;

import java.util.concurrent.ForkJoinPool;

import mytask.MyRecursiveTask1;

public class Run1_2 {

	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask1 task1 = null;
		ForkJoinPool pool = new ForkJoinPool();
		for (int i = 0; i < 50; i++) {
			task1 = new MyRecursiveTask1();
			pool.submit(task1);
		}
		Thread.sleep(50);
		System.out.println("getParallelism()=" + pool.getParallelism()
				+ " getPoolSize()=" + pool.getPoolSize()
				+ " getQueuedSubmissionCount()="
				+ pool.getQueuedSubmissionCount() + " hasQueuedSubmissions()="
				+ pool.hasQueuedSubmissions());
		do {
		} while (!task1.isDone());
	}
}
