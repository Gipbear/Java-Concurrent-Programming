package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import task.MyRecursiveTask;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		MyRecursiveTask task = new MyRecursiveTask(1, 20);
		ForkJoinTask<String> runTaskA = pool.submit(task);
		System.out.println(runTaskA.join());
		Thread.sleep(5000);
	}
}
