package test.run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import myrunnable.MyRunnable;

public class Run {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 3; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}
	}
}
