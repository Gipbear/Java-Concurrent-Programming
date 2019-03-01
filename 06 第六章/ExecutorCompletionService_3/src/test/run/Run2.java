package test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import mycallable.MyCallableA;
import mycallable.MyCallableB;

public class Run2 {

	public static void main(String[] args) {

		try {
			MyCallableA callableA = new MyCallableA();
			MyCallableB callableB = new MyCallableB();

			Executor executor = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableA);
			csRef.submit(callableB);

			for (int i = 0; i < 2; i++) {
				System.out.println("zzzzzzzzzzzz" + " "
						+ csRef.poll(6, TimeUnit.SECONDS).get());
				System.out.println("X");
			}
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
