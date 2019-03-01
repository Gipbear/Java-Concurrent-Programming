package test.run;

import java.util.concurrent.CyclicBarrier;

import extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		CyclicBarrier cbRef = new CyclicBarrier(5, new Runnable() {
			public void run() {
				System.out.println("全都到了！");
			}
		});
		MyThread[] threadArray = new MyThread[5];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(cbRef);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
	}
}
