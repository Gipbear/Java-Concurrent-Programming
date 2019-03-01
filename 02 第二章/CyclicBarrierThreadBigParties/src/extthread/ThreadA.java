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
			System.out.println(Thread.currentThread().getName() + " begin ="
					+ System.currentTimeMillis() + " 等待凑齐2个继续运行");
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + "   end ="
					+ System.currentTimeMillis() + " 已经凑齐2个继续运行");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}
