package test;

import service.MyServiceB;
import extthread.ThreadB;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		MyServiceB service = new MyServiceB();
		for (int i = 0; i < 100; i++) {
			ThreadB a = new ThreadB(service);
			a.start();
		}
		Thread.sleep(10000);
		System.out.println(service.queue.size());
	}
}
