package test.run;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mycallable.MyCallableA;
import mycallable.MyCallableB;

public class Run {

	public static void main(String[] args) {
		try {
			List list = new ArrayList();
			list.add(new MyCallableA());
			list.add(new MyCallableB());

			ExecutorService executor = Executors.newCachedThreadPool();
			System.out.println(executor);
			String getValueA = executor.invokeAny(list);
			System.out.println("返回值" + getValueA);
			System.out.println("mainEND");
		} catch (InterruptedException e) {
			System.out.println("进入catch InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("进入catch ExecutionException");
			e.printStackTrace();
		}

	}
}
