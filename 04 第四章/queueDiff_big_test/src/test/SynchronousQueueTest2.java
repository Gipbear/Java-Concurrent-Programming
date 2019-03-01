package test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class SynchronousQueueTest2 {

	public static void main(String[] args) throws InterruptedException {
		SynchronousQueue linked = new SynchronousQueue<Runnable>();
		System.out.println(linked.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, linked);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + linked.size());
		// 直接执行3个任务
		// 有一个任务被拒绝
	}
}
