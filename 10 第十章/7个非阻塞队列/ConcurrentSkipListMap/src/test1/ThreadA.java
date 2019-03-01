package test1;

import java.util.Map.Entry;

public class ThreadA extends Thread {

	private MyService1 service;

	public ThreadA(MyService1 service) {
		super();
		this.service = service;
	}

	public void run() {
		try {
			while (!service.map.isEmpty()) {
				Entry entry = service.map.pollFirstEntry();
				Userinfo userinfo = (Userinfo) entry.getKey();
				System.out.println(userinfo.getId() + " "
						+ userinfo.getUsername() + " " + entry.getValue());
				Thread.sleep((long) (Math.random() * 1000));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
