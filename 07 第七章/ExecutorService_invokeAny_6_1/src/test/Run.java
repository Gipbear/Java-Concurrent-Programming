package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import mycallable.MyCallableA;

public class Run {

	public static void main(String[] args) {

		try {
			List list = new ArrayList();
			list.add(new MyCallableA());

			ExecutorService service = Executors.newCachedThreadPool();
			String getString = service.invokeAny(list, 1, TimeUnit.SECONDS);
			System.out.println("zzzz=" + getString);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("mainA");
		} catch (ExecutionException e) {
			e.printStackTrace();
			System.out.println("mainB");
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println("mainC");
		}

	}

}
