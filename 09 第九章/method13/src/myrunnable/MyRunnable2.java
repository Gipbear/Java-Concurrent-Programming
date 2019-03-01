package myrunnable;

public class MyRunnable2 implements Runnable {
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
