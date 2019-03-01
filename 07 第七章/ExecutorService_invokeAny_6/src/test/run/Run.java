package test.run;

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
			MyCallableA a = new MyCallableA();

			List callableList = new ArrayList();
			callableList.add(a);

			ExecutorService service = Executors.newCachedThreadPool();
			String getValue = service.invokeAny(callableList, 1,
					TimeUnit.SECONDS);
			System.out.println("=============" + getValue);
			System.out.println("zzzzzzzzzzzzzzzz");
		} catch (InterruptedException e) {
			System.out.println("进入catch InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("进入catch ExecutionException");
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.out.println("进入catch TimeoutException 超时了");
			e.printStackTrace();
		}
	}
}
