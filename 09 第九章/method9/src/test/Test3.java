package test;

import java.util.concurrent.ForkJoinPool;

import myrunnable.MyRunnable2;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable2 myRunnable = new MyRunnable2();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		Thread.sleep(1000);
		pool.shutdownNow();// 返回一个空的List
		pool.execute(myRunnable);
		System.out.println("main end!");
		Thread.sleep(Integer.MAX_VALUE);

		// shutdown:
		// 每个任务正常运行直到结束，
		// 池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常。

		// shutdownNow结合isInterrupted() ==true判断:
		// 立即停止当前正在执行的任务
		// 池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常

		// shutdownNow未结合isInterrupted() ==true判断:
		// 每个任务正常运行直到结束
		// 池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常
	}
}
