package test.run;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

import mycallable.MyCallableA;
import mycallable.MyCallableB;

public class Run1 {

	public static void main(String[] args) {

		MyCallableA callableA = new MyCallableA();
		MyCallableB callableB = new MyCallableB();

		Executor executor = Executors.newCachedThreadPool();
		CompletionService csRef = new ExecutorCompletionService(executor);
		csRef.submit(callableA);
		csRef.submit(callableB);

		for (int i = 0; i < 2; i++) {
			System.out.println("zzzzzzzzzzzz" + " " + csRef.poll());
		}
		System.out.println("main end!");
	}
}
