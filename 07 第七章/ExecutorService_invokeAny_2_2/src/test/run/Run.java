package test.run;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import mycallable.MyCallableA;
import mycallable.MyCallableB;

public class Run {

	public static void main(String[] args) {

		try {
			ThreadPoolExecutor abc;

			List list = new ArrayList();
			list.add(new MyCallableA());
			list.add(new MyCallableB());

			ExecutorService executor = Executors.newCachedThreadPool();
			System.out.println(executor);
			String getValueA = executor.invokeAny(list);
			System.out.println("============" + getValueA);
			System.out.println("ZZZZZZZZZZZZZZZZ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}
