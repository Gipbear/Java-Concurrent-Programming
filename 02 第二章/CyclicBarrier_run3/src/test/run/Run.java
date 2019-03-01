package test.run;

import service.MyService;
import extthread.MyThreadA;
import extthread.MyThreadB;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.start();
		MyThreadB b = new MyThreadB(service);
		b.start();
	}

}
