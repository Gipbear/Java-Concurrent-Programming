package service;

import java.util.concurrent.Phaser;

public class MyService {

	public Phaser phaser;

	public MyService(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin A1 "
					+ System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println(phaser.getArrivedParties());
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + "   end A1 "
					+ System.currentTimeMillis());

			System.out.println(Thread.currentThread().getName() + " begin A2 "
					+ System.currentTimeMillis());
			Thread.sleep(3000);
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + "   end A2 "
					+ System.currentTimeMillis());

			System.out.println(Thread.currentThread().getName() + " begin A3 "
					+ System.currentTimeMillis());
			Thread.sleep(3000);
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + "   end A3 "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void testMethodB() {
		System.out.println(Thread.currentThread().getName() + " begin A1 "
				+ System.currentTimeMillis());
		phaser.arrive();
		System.out.println(Thread.currentThread().getName() + "   end A1 "
				+ System.currentTimeMillis());

		System.out.println(Thread.currentThread().getName() + " begin A2 "
				+ System.currentTimeMillis());
		phaser.arrive();
		System.out.println(Thread.currentThread().getName() + "   end A2 "
				+ System.currentTimeMillis());

		System.out.println(Thread.currentThread().getName() + " begin A3 "
				+ System.currentTimeMillis());
		phaser.arrive();
		System.out.println(Thread.currentThread().getName() + "   end A3 "
				+ System.currentTimeMillis());
	}

}
