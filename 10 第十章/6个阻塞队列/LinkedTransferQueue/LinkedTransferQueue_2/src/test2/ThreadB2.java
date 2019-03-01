package test2;

public class ThreadB2 extends Thread {

	private MyServiceB service;

	public ThreadB2(MyServiceB service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " beginB "
					+ System.currentTimeMillis());
			service.queue.transfer("Œ“¥”ThreadB2¿¥");
			System.out.println(Thread.currentThread().getName() + "   endB "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
