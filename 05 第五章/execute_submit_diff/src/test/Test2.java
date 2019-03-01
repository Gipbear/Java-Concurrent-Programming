package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {

	public static void main(String[] args) {
		ExecutorService executor = new ThreadPoolExecutor(50,
				Integer.MAX_VALUE, 5, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		executor.execute(new Runnable() {
			@Override
			public void run() {
				Integer.parseInt("a");
			}
		});
	}
}
