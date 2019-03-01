package test.run;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import mycallable.MyCallable;

public class Run1 {

	public static void main(String[] args) {
		try {
			MyCallable callable = new MyCallable();
			ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5L,
					TimeUnit.SECONDS, new LinkedBlockingDeque());
			System.out.println("begin " + System.currentTimeMillis());
			Future<String> future = executor.submit(callable);
			System.out.println("返回值" + future.get(5, TimeUnit.SECONDS));
			System.out.println("  end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			System.out.println("进入catch InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("进入catch ExecutionException");
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.out.println("进入catch TimeoutException");
			e.printStackTrace();
		}
	}
}
