package mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	public String call() throws Exception {
		Thread.sleep(10000);
		System.out.println("sleep 10√Î÷¥––ÕÍ¡À£°");
		return "anyString";
	}
}
