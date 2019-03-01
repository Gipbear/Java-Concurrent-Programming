package test;

import java.util.concurrent.CyclicBarrier;
import extthread.ThreadA;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cbRef = new CyclicBarrier(2, new Runnable() {
			@Override
			public void run() {
				System.out.println("È«À´ÁË£¡");
			}
		});

		for (int i = 0; i < 4; i++) {
			ThreadA threadA1 = new ThreadA(cbRef);
			threadA1.start();
			Thread.sleep(2000);
		}
	}
}
