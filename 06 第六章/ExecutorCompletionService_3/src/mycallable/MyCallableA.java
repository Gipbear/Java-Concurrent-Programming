package mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {
	public String call() throws Exception {
		Thread.sleep(5000);
		System.out.println("MyCallableA " + System.currentTimeMillis());
		return "returnA";
	}
}
