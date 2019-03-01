package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable1;

public class Test0 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(myRunnable);
		Thread.sleep(2000);
		pool.shutdownNow();
		System.out.println("main end");
		Thread.sleep(Integer.MAX_VALUE);
	}
}
