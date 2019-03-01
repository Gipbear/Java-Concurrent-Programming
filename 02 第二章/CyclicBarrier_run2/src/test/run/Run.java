package test.run;

import service.MyService;
import extthread.MyThreadA;
import extthread.MyThreadB;
import extthread.MyThreadC;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.setName("A");
		MyThreadB b = new MyThreadB(service);
		b.setName("B");
		MyThreadC c = new MyThreadC(service);
		c.setName("C");

		a.start();
		b.start();
		c.start();

	}

}
