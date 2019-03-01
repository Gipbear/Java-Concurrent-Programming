package extthread;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ThreadA extends Thread {

	private Phaser phaser;

	public ThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin "
					+ System.currentTimeMillis());
			phaser.awaitAdvanceInterruptibly(0, 5, TimeUnit.SECONDS);
			System.out.println(Thread.currentThread().getName() + "   end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException e");
		} catch (TimeoutException e) {
			e.printStackTrace();
			System.out.println("TimeoutException e");
		}
	}

}
