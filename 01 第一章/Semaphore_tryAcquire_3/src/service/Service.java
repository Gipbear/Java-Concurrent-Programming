package service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Service {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		try {
			if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
				System.out.println("ThreadName="
						+ Thread.currentThread().getName() + "首选进入！");
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					// String newString = new String();
					// Math.random();
				}
				semaphore.release();
			} else {
				System.out.println("ThreadName="
						+ Thread.currentThread().getName() + "未成功进入！");
			}
			// 方法release对应的permits值也要更改
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
