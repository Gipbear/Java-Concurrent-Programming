package extthread;

import service.MyServiceA;

public class ThreadA extends Thread {

	private MyServiceA service;

	public ThreadA(MyServiceA service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			service.serviceMethod();
		}
		System.out.println("z");
	}

}
