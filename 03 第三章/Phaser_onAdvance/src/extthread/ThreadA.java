package extthread;

import java.util.concurrent.Phaser;

import service.MyService;

public class ThreadA extends Thread {

	private MyService myService;

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	public void run() {
		myService.testMethod();

	}

}
