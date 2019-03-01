package test;

import java.util.concurrent.ForkJoinPool;

import myrunnable.MyRunnable1;

public class Test3 {
	public static void main(String[] args) {
		try {
			MyRunnable1 myRunnable = new MyRunnable1();
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(myRunnable);
			Thread.sleep(1000);
			pool.shutdown();
			pool.submit(myRunnable);
			System.out.println("main end!");
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
