package service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private Semaphore semaphore = new Semaphore(3);
	private ReentrantLock lock = new ReentrantLock();

	public void sayHello() {
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "准备");
			lock.lock();
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "打印"
						+ (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			lock.unlock();
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "结束");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
