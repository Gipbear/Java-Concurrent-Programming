package mycallable;

import java.util.concurrent.Callable;

public class MyCallableB implements Callable<String> {
	public String call() throws Exception {
		Thread.sleep(10000);
		System.out.println("MyCallableB " + System.currentTimeMillis());
		return "returnB";
	}
}
