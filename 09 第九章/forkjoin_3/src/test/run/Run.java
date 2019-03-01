package test.run;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import mytask.MyRecursiveTask;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		try {
			MyRecursiveTask task = new MyRecursiveTask(1, 10);
			ForkJoinPool pool = new ForkJoinPool();
			pool.submit(task);
			System.out.println("结果值为：" + task.get());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
