package mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	private long sleepValue;

	public MyCallable(long sleepValue) {
		super();
		this.sleepValue = sleepValue;
	}

	@Override
	public String call() throws Exception {
		try {
			System.out.println(Thread.currentThread().getName() + " sleep"
					+ sleepValue + " nowTime：" + System.currentTimeMillis());
			Thread.sleep(sleepValue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "我是返回值";
	}

}
