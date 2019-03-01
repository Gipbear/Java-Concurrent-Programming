package extthread;

import java.util.concurrent.Phaser;

public class ThreadD extends Thread {

	private Phaser phaser;

	public ThreadD(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			phaser.arriveAndAwaitAdvance();
			System.out.println(Thread.currentThread().getName() + " A1   end="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
