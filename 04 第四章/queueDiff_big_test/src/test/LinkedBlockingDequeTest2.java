package test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class LinkedBlockingDequeTest2 {

	public static void main(String[] args) throws InterruptedException {
		// LinkedBlockingDeque使用带参构造
		// max值被参考
		// 但队列容量不够，有一个任务出现异常
		LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>(2);
		System.out.println(linked.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, linked);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + linked.size());
		// 先放入队列2个任务，再执行3个任务
		// 有1个任务被拒绝
	}
}
