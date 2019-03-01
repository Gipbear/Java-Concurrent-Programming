package test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class getMaximumPoolSize_test1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 100,
				TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		System.out.println("getMaximumPoolSize=" + executor.getMaximumPoolSize());
	}
}
