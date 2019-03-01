package test;

import java.util.concurrent.CyclicBarrier;

import service.MyService;
import extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		int parties = 4;
		CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
			public void run() {
				System.out.println("∂ºµΩ¡À£°");
			}
		});

		MyService myService = new MyService(cbRef);

		MyThread[] threadArray = new MyThread[4];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(myService);
			threadArray[i].start();
		}

	}
}
