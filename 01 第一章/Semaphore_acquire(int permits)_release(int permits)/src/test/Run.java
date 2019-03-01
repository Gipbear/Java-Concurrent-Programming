package test;

import service.Service;
import extthread.ThreadA;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();

		ThreadA[] a = new ThreadA[10];
		for (int i = 0; i < 10; i++) {
			a[i] = new ThreadA(service);
			a[i].start();
		}

	}

}
