package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mycallable.MyCallableB;
import mycallable.MyCallableA;

public class Run {

	public static void main(String[] args) {

		try {
			List list = new ArrayList();
			list.add(new MyCallableB());
			list.add(new MyCallableA());

			ExecutorService service = Executors.newCachedThreadPool();
			String getString = service.invokeAny(list);
			System.out.println("main取得的返回值=" + getString);
		} catch (InterruptedException e) {
			System.out.println("main Interrupted_Exception");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("main Execution_Exception");
			e.printStackTrace();
		}
	}
}
