package extthread;

import java.util.concurrent.Phaser;

public class ThreadC extends Thread {

	private Phaser phaser;

	public ThreadC(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " A1 begin="
					+ System.currentTimeMillis());
			Thread.sleep(3000);
			phaser.awaitAdvance(0);// 跨栏的栏数
			System.out.println(Thread.currentThread().getName() + " A1   end="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
