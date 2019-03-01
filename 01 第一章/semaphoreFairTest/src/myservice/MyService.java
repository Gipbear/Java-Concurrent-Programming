package myservice;

import java.util.concurrent.Semaphore;

public class MyService {

	private boolean isFair = true;
	private Semaphore semaphore = new Semaphore(1, isFair);

	public void testMethod() {
		try {
			semaphore.acquire();
			System.out
					.println("ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
