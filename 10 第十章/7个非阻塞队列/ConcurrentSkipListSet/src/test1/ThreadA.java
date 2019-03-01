package test1;

public class ThreadA extends Thread {

	private MyService1 service;

	public ThreadA(MyService1 service) {
		super();
		this.service = service;
	}

	public void run() {
		try {
			while (!service.map.isEmpty()) {
				Userinfo userinfo = (Userinfo) service.map.pollFirst();
				System.out.println(userinfo.getId() + " "
						+ userinfo.getUsername());
				Thread.sleep((long) (Math.random() * 1000));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
