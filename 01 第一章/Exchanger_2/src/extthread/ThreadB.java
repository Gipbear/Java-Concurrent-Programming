package extthread;

import java.util.concurrent.Exchanger;

public class ThreadB extends Thread {

	private Exchanger<String> exchanger;

	public ThreadB(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println("在线程B中得到线程A的值=" + exchanger.exchange("中国人B"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
