package myrunnable;

public class MyRunnable2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " "
				+ System.currentTimeMillis());
		String abc = null;
		abc.indexOf(0);
		System.out.println(Thread.currentThread().getName() + " "
				+ System.currentTimeMillis());
	}
}
