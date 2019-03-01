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
		// 线程C未实例化
		a.start();
		b.start();

		Thread.sleep(2000);
		service.cyclicBarrier.reset();

	}

}
