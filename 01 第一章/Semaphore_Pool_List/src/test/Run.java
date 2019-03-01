package test;

import tools.ListPool;
import extthread.MyThread;

public class Run {

	public static void main(String[] args) {

		ListPool pool = new ListPool();

		MyThread[] threadArray = new MyThread[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(pool);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}

	}
}
