package extthread;

import java.util.concurrent.Phaser;

import service.MyService;

public class ThreadB extends Thread {

	private MyService myService;

	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}

	public void run() {
		myService.testMethod();

	}

}
