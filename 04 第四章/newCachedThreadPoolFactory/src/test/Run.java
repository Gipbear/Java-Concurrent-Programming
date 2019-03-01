package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mythreadfactory.MyThreadFactory;

public class Run {
	public static void main(String[] args) {
		MyThreadFactory threadFactory = new MyThreadFactory();
		ExecutorService executorService = Executors
				.newCachedThreadPool(threadFactory);
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("我在运行" + System.currentTimeMillis() + " "
						+ Thread.currentThread().getName());
			}
		});
	}
}
