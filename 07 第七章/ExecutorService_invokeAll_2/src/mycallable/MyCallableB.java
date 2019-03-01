package mycallable;

import java.util.concurrent.Callable;

public class MyCallableB implements Callable<String> {

	public String call() throws Exception {
		System.out.println("MyCallableB begin " + System.currentTimeMillis());
		for (int i = 0; i < 223456; i++) {
			Math.random();
			Math.random();
			Math.random();
			System.out.println("MyCallableB " + (i + 1));
		}
		System.out.println("MyCallableB   end " + System.currentTimeMillis());
		if (1 == 1) {
			System.out.println("B报错了");
			throw new Exception("出现异常");
		}
		return "returnB";
	}

}
