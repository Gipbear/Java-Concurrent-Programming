package test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import myrunnable.MyRunnable;

public class Test {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 10,
				TimeUnit.SECONDS, new LinkedBlockingDeque());
		for (int i = 0; i < 50; i++) {
			MyRunnable myrunnable = new MyRunnable("username" + (i + 1));
			executor.execute(myrunnable);
		}
	}

}
