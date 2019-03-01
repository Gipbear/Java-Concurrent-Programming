package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {

	public static void main(String[] args) {
		try {
			ExecutorService executor = new ThreadPoolExecutor(50,
					Integer.MAX_VALUE, 5, TimeUnit.SECONDS,
					new LinkedBlockingDeque<Runnable>());
			Future future = executor.submit(new Callable<String>() {
				@Override
				public String call() throws Exception {
					Integer.parseInt("a");
					return "我是返回值";
				}
			});
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
			System.out.println("能捕获异常");
		}
	}
}
