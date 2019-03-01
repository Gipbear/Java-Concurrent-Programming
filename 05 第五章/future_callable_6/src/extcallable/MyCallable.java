package extcallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	private String number;

	public MyCallable(String number) {
		super();
		this.number = number;
	}

	@Override
	public String call() throws Exception {
		Integer.parseInt("a");
		return "我是高洪岩" + number;
	}
}
