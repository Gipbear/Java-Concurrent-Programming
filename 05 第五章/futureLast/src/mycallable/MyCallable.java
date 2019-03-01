package mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	private String username;
	private long sleepValue;

	public MyCallable(String username, long sleepValue) {
		super();
		this.username = username;
		this.sleepValue = sleepValue;
	}

	@Override
	public String call() throws Exception {
		System.out.println(username);
		Thread.sleep(sleepValue);
		return "return " + username;
	}

}
