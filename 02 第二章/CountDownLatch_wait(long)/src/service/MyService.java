package service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MyService {

	public CountDownLatch count = new CountDownLatch(1);

	public void testMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + " 准备 "
					+ System.currentTimeMillis());
			count.await(3, TimeUnit.SECONDS);
			System.out.println(Thread.currentThread().getName() + " 结束 "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
