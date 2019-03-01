package extthread;

import java.util.concurrent.Callable;

public class CallableB implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " begin "
				+ System.currentTimeMillis());
		Thread.sleep(8000);
		System.out.println(Thread.currentThread().getName() + "   end "
				+ System.currentTimeMillis());
		return "returnB";
	}
}
