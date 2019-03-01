package mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {

	public String call() throws Exception {
		System.out.println("MyCallableA begin " + System.currentTimeMillis());
		for (int i = 0; i < 123; i++) {
			Math.random();
			Math.random();
			Math.random();
			System.out.println("MyCallableA " + (i + 1));
		}
		System.out.println("MyCallableA   end " + System.currentTimeMillis());
		if (1 == 1) {
			System.out.println("1==1");
			throw new Exception("±¨´íÁËAAAAA");
		}
		return "returnA";
	}

}
