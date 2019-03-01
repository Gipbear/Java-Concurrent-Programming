package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mythreadfactory.MyThreadFactory;

public class Run {
	public static void main(String[] args) {
		MyThreadFactory threadFactory = new MyThreadFactory();
		ExecutorService executorService = Executors.newFixedThreadPool(2,
				threadFactory);
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					System.out.println("begin 我在运行"
							+ System.currentTimeMillis() + " "
							+ Thread.currentThread().getName());
					Thread.sleep(3000);
					System.out.println("  end 我在运行"
							+ System.currentTimeMillis() + " "
							+ Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
	}
}
