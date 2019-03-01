package test;

import java.util.concurrent.Semaphore;

public class Run {

	public static void main(String[] args) {
		try {
			Semaphore semaphore = new Semaphore(5);
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			semaphore.acquire();
			System.out.println(semaphore.availablePermits());
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			semaphore.release();
			System.out.println(semaphore.availablePermits());
			semaphore.release(4);
			System.out.println(semaphore.availablePermits());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
