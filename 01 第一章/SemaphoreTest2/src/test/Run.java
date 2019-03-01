package test;

import service.Service;
import extthread.ThreadA;
import extthread.ThreadB;
import extthread.ThreadC;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		ThreadC c = new ThreadC(service);
		c.setName("C");
		a.start();
		b.start();
		c.start();
	}

}
