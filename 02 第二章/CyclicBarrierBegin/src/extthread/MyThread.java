package extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread extends Thread {

	private CyclicBarrier cbRef;

	public MyThread(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	@Override
	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println(Thread.currentThread().getName() + " 到了! "
					+ System.currentTimeMillis());
			cbRef.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
