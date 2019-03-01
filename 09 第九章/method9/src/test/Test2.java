package test;

import java.util.concurrent.ForkJoinPool;

import myrunnable.MyRunnable2;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable2 myRunnable = new MyRunnable2();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		Thread.sleep(1000);
		pool.shutdownNow();
		System.out.println("main end!");
		Thread.sleep(Integer.MAX_VALUE);
	}
}
