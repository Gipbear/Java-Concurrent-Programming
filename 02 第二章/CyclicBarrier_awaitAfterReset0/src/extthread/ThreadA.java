package extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadA extends Thread {

	private CyclicBarrier cbRef;

	public ThreadA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	@Override
	public void run() {
		try {
			cbRef.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}
