package service;

import java.util.concurrent.Semaphore;

public class Service {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		semaphore.acquireUninterruptibly();
		System.out.println(Thread.currentThread().getName() + " begin timer="
				+ System.currentTimeMillis());
		for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
			String newString = new String();
			Math.random();
		}
		System.out.println(Thread.currentThread().getName() + "   end timer="
				+ System.currentTimeMillis());
		semaphore.release();
	}

}
