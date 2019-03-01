package test.run;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import mycallable.MyCallable;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		try {
			MyCallable callable = new MyCallable(100);

			ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5L,
					TimeUnit.SECONDS, new LinkedBlockingDeque());
			Future<String> future = executor.submit(callable);
			System.out.println("main A " + System.currentTimeMillis());
			System.out.println(future.get());
			System.out.println("main B " + System.currentTimeMillis());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
