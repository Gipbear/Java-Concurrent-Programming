package service;

import java.util.concurrent.Semaphore;

public class Service {

	private Semaphore semaphore = new Semaphore(3);

	public void sayHello() {
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "准备");
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "打印"
						+ (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "结束");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
