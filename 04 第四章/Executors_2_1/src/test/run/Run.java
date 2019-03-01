package test.run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import myrunnable.MyRunnable;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}

	}
}
