package extthread;

import service.MyService;

public class ThreadB extends Thread {

	private MyService myService;

	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.testMethodA();
	}

}
