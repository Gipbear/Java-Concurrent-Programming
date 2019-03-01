package service;

import java.util.concurrent.LinkedBlockingQueue;

public class MyServiceB {
	public LinkedBlockingQueue queue = new LinkedBlockingQueue();

	public MyServiceB() {
		super();
		for (int i = 0; i < 10000; i++) {
			queue.add("myString");
		}
	}

	public void serviceMethod() {
		queue.poll();
	}

}
