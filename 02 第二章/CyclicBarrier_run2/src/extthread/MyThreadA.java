package extthread;

import service.MyService;

public class MyThreadA extends Thread {

	private MyService service;

	public MyThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
