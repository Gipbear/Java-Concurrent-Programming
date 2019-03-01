package service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Service {

	private Semaphore semaphore = new Semaphore(3);

	public void testMethod() {
		// 1改成3
		try {
			if (semaphore.tryAcquire(3, 3, TimeUnit.SECONDS)) {
				System.out.println("ThreadName="
						+ Thread.currentThread().getName() + "首选进入！");
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
				}
				// 方法release对应的permits值也要更改
				semaphore.release(3);
			} else {
				System.out.println("ThreadName="
						+ Thread.currentThread().getName() + "未成功进入！");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
