package mycallable;

import java.util.concurrent.Callable;

public class MyCallableB implements Callable<String> {

	public String call() throws Exception {
		System.out.println("MyCallableB begin " + System.currentTimeMillis());
		Thread.sleep(5000);
		int i = 0;
		if (i == 0) {
			throw new Exception("Å×³öÒì³££¡");
		}
		System.out.println("MyCallableB   end " + System.currentTimeMillis());
		return "returnB";
	}

}
