package extthread;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

	private CountDownLatch maxRuner;

	public MyThread(CountDownLatch maxRuner) {
		super();
		this.maxRuner = maxRuner;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			maxRuner.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
