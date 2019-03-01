package extthread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadA extends Thread {

	@Override
	public void run() {
		MyThreadB b = new MyThreadB();

		LinkedBlockingDeque queue = new LinkedBlockingDeque(2);
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, queue,
				new ThreadPoolExecutor.CallerRunsPolicy());
		System.out.println("a begin " + Thread.currentThread().getName() + " "
				+ System.currentTimeMillis());
		pool.execute(b);
		pool.execute(b);
		pool.execute(b);
		pool.execute(b);
		pool.execute(b);
		pool.execute(b);
		System.out.println("a   end " + Thread.currentThread().getName() + " "
				+ System.currentTimeMillis());
		System.out.println("a   end " + System.currentTimeMillis());

	}

}
