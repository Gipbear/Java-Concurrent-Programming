package test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {
	// 获取基本属性corePoolSize和maximumPoolSize
	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println(executor.getCorePoolSize());
		System.out.println(executor.getMaximumPoolSize());
		System.out.println("");
		executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>());
		System.out.println(executor.getCorePoolSize());
		System.out.println(executor.getMaximumPoolSize());
	}

}
