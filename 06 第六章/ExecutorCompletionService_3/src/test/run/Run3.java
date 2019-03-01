package test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import mycallable.MyCallableA;
import mycallable.MyCallableB;

public class Run3 {

	public static void main(String[] args) {

		try {
			MyCallableA callableA = new MyCallableA();
			MyCallableB callableB = new MyCallableB();

			Executor executor = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableA);
			csRef.submit(callableB);

			System.out.println("zzzzzzzzzzzz" + " "
					+ csRef.poll(4, TimeUnit.SECONDS) + " "
					+ System.currentTimeMillis());
			System.out.println("X");
			System.out.println("zzzzzzzzzzzz" + " "
					+ csRef.poll(2, TimeUnit.SECONDS).get() + " "
					+ System.currentTimeMillis());
			System.out.println("X");
			System.out.println("zzzzzzzzzzzz" + " "
					+ csRef.poll(5, TimeUnit.SECONDS).get() + " "
					+ System.currentTimeMillis());
			System.out.println("X");

			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
