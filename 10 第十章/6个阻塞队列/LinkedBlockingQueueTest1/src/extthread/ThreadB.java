package extthread;

import service.MyServiceB;

public class ThreadB extends Thread {

	private MyServiceB service;

	public ThreadB(MyServiceB service) {
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
