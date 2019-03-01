package mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {
	public String call() throws Exception {
		System.out.println("a call run =" + System.currentTimeMillis());
		return "returnA";
	}

}
