package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable1;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		System.out.println("main begin ! " + System.currentTimeMillis());
		System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
		System.out.println("main   end ! " + System.currentTimeMillis());
		// 此实验说明awaitTermination()方法具有阻塞特性
	}
}
