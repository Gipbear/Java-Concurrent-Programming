package extthread;

import service.MyService;

public class MyThreadC extends Thread {

	private MyService service;

	public MyThreadC(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
