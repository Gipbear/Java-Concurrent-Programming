package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class ArrayBlockingQueueTest2 {

	public static void main(String[] args) throws InterruptedException {
		// ArrayBlockingQueue使用带参构造
		// max值被参考
		// 但队列容量不够，有一个任务出现异常
		ArrayBlockingQueue array = new ArrayBlockingQueue(2);
		System.out.println(array.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, array);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + array.size());
		// 先放入队列2个任务，再执行3个任务
		// 有1个任务被拒绝
	}

}
