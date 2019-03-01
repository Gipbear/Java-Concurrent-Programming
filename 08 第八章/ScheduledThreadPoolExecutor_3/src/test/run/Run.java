package test.run;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import mycallable.MyCallableA;

public class Run {
	public static void main(String[] args) {
		try {
			List<Callable> callableList = new ArrayList();
			callableList.add(new MyCallableA());
			ScheduledExecutorService executor = Executors
					.newSingleThreadScheduledExecutor();
			System.out.println("          X=" + System.currentTimeMillis());
			ScheduledFuture<String> futureA = executor.schedule(callableList
					.get(0), 4L, TimeUnit.SECONDS);
			System.out.println(futureA.get() + "   A="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}
