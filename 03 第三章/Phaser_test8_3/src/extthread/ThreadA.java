package extthread;

import java.util.concurrent.Phaser;

public class ThreadA extends Thread {

	private Phaser phaser;

	public ThreadA(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin="
					+ System.currentTimeMillis());
			phaser.awaitAdvanceInterruptibly(10);// 不符合栏数就继续运行
			System.out.println(Thread.currentThread().getName() + " A1   end="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			System.out.println("进入catch");
			e.printStackTrace();
		}
	}

}
