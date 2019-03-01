package mycallable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("      begin =" + System.currentTimeMillis()
				+ " ThreadName=" + Thread.currentThread().getName());
		System.out.println("        end =" + System.currentTimeMillis()
				+ " ThreadName=" + Thread.currentThread().getName());
	}

}
