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
import mycallable.MyCallableB;

public class Run1 {
	public static void main(String[] args) {
		try {
			List<Callable> callableList = new ArrayList();
			callableList.add(new MyCallableA());
			callableList.add(new MyCallableB());
			// 调用方法newSingleThreadScheduledExecutor
			// 取得一个单任务的计划任务执行池
			ScheduledExecutorService executor = Executors
					.newSingleThreadScheduledExecutor();
			ScheduledFuture<String> futureA = executor.schedule(callableList
					.get(0), 4L, TimeUnit.SECONDS);
			ScheduledFuture<String> futureB = executor.schedule(callableList
					.get(1), 4L, TimeUnit.SECONDS);
			System.out.println("          X=" + System.currentTimeMillis());
			System.out.println("返回值A：" + futureA.get());
			System.out.println("返回值B：" + futureB.get());
			System.out.println("          Y=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
