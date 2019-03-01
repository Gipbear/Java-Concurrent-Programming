package mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {

	public String call() throws Exception {
		System.out.println("MyCallableA begin " + System.currentTimeMillis());
		for (int i = 0; i < 123456; i++) {
			Math.random();
			Math.random();
			Math.random();
			System.out.println("MyCallableA " + (i + 1));
		}
		System.out.println("MyCallableA   end " + System.currentTimeMillis());
		return "returnA";
	}

}
