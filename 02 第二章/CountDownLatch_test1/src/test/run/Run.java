package test.run;

import service.MyService;
import extthread.MyThread;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread t = new MyThread(service);
		t.start();
		Thread.sleep(2000);
		service.downMethod();
	}
}
