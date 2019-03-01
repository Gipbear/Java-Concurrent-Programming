package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable1;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		pool.shutdown();
		System.out.println(System.currentTimeMillis());
		System.out.println(pool.awaitTermination(Integer.MAX_VALUE,
				TimeUnit.SECONDS)
				+ " " + System.currentTimeMillis() + " 全部任务执行完毕！");
		System.out.println(System.currentTimeMillis());
	}
}
