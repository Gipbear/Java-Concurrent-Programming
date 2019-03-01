package test.run;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import extcallable.MyCallable;

public class Run {

	public static void main(String[] args) {
		try {
			MyCallable callable = new MyCallable("1");
			ExecutorService executorRef = Executors.newCachedThreadPool();
			Future<String> future = executorRef.submit(callable);
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("里面出错了！");
			e.printStackTrace();
		}
	}
}
