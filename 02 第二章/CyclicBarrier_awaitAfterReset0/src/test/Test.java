package test;

import java.util.concurrent.CyclicBarrier;

import extthread.ThreadA;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cbRef = new CyclicBarrier(3);

		ThreadA threadA1 = new ThreadA(cbRef);
		threadA1.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA2 = new ThreadA(cbRef);
		threadA2.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA3 = new ThreadA(cbRef);
		threadA3.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

		ThreadA threadA4 = new ThreadA(cbRef);
		threadA4.start();
		Thread.sleep(500);
		System.out.println(cbRef.getNumberWaiting());

	}
}
