package service;

import java.util.concurrent.CountDownLatch;

public class MyService {

	private CountDownLatch down = new CountDownLatch(1);

	public void testMethod() {
		try {
			System.out.println("A");
			down.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void downMethod() {
		System.out.println("X");
		down.countDown();
	}

}
