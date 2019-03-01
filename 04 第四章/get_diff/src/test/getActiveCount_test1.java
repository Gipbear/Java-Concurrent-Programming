package test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import extthread.MyThreadA;

public class getActiveCount_test1 {

	public static void main(String[] args) throws InterruptedException {
		try {
			MyThreadA a = new MyThreadA();

			SynchronousQueue queue = new SynchronousQueue();
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5,
					TimeUnit.SECONDS, queue);
			pool.execute(a);
			pool.execute(a);
			pool.execute(a);
			System.out
					.println(pool.getActiveCount() + " " + pool.getPoolSize());
			Thread.sleep(7000);
			System.out
					.println(pool.getActiveCount() + " " + pool.getPoolSize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
