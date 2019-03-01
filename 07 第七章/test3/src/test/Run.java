package test;

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

			ExecutorService service = Executors.newCachedThreadPool();
			String getString = service.invokeAny(list);
			System.out.println("zzzz=" + getString);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
