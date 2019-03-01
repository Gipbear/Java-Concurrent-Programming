package extthread;

import service.MyService;

public class ThreadC extends Thread {

	private MyService myService;

	public ThreadC(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.testMethodB();
	}

}
