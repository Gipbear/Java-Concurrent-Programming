package extthread;

import java.util.concurrent.Phaser;

public class ThreadB extends Thread {

	private Phaser phaser;

	public ThreadB(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " A1 begin="
				+ System.currentTimeMillis());
		phaser.arriveAndAwaitAdvance();
		System.out.println(Thread.currentThread().getName() + " A1   end="
				+ System.currentTimeMillis());
	}

}
