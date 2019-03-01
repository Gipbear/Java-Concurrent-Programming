package mycallable;

import java.util.concurrent.Callable;

public class MyCallableB implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("MyCallableB " + Thread.currentThread().getName()
				+ " begin " + System.currentTimeMillis());
		for (int i = 0; i < 193456; i++) {
			String newString = new String();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			System.out.println("MyCallableB 在运行中=" + (i + 1));
		}
		System.out.println("MyCallableB " + Thread.currentThread().getName()
				+ "   end " + System.currentTimeMillis());
		return "returnB";
	}

}
