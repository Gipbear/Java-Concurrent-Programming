package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable1;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		pool.shutdown();
		System.out.println("main begin ! " + System.currentTimeMillis());
		System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
		System.out.println("main   end ! " + System.currentTimeMillis());
		// 代码：awaitTermination(10, TimeUnit.SECONDS)作用：
		// 最多等待10秒，也就是阻塞10秒
	}
}
