package mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		try {
			while (1 == 1) {
				if (Thread.currentThread().isInterrupted() == true) {
					throw new InterruptedException();
				}
				System.out.println(Thread.currentThread().getName() + " "
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "我的年龄是100";
	}

}
