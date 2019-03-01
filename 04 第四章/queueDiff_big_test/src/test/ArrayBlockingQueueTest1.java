package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class ArrayBlockingQueueTest1 {

	public static void main(String[] args) throws InterruptedException {
		// ArrayBlockingQueue使用带参构造
		// max值被参考
		ArrayBlockingQueue array = new ArrayBlockingQueue(2);
		System.out.println(array.size());
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, array);
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		pool.execute(new MyRunnable());
		System.out.println(pool.getPoolSize() + " " + array.size());
		// 先放入队列2个任务，再执行3个任务
	}

}
