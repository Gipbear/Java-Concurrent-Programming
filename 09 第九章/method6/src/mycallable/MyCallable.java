package mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "我是返回值callableVersion";
	}

}
