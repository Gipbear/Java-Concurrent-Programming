package mycallable;

import java.util.concurrent.Callable;

public class MyCallableB2 implements Callable<String> {

	public String call() throws Exception {
		System.out.println("MyCallableB begin " + System.currentTimeMillis());
		for (int i = 0; i < 223456; i++) {
			if (Thread.currentThread().isInterrupted() == false) {
				Math.random();
				Math.random();
				Math.random();
				System.out.println("MyCallableB " + (i + 1));
			} else {
				System.out.println("***********抛出异常中断了");
				throw new InterruptedException();
			}
		}
		System.out.println("MyCallableB   end " + System.currentTimeMillis());
		return "returnB";
	}

}
