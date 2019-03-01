package myservice;

import java.util.concurrent.Semaphore;

public class MyService {

	private Semaphore semaphore = new Semaphore(10);

	public void testMethod() {
		try {
			semaphore.acquire();
			System.out.println(semaphore.availablePermits());
			System.out.println(semaphore.availablePermits());
			System.out.println(semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

}
