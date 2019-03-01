package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import mytask.MyRecursiveTask;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask action1 = new MyRecursiveTask();
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask task = pool.submit(action1);
		System.out.println(task.isCompletedAbnormally() + " "
				+ task.isCompletedNormally());
		Thread.sleep(2000);
		System.out.println(task.isCompletedAbnormally() + " "
				+ task.isCompletedNormally());
		System.out.println(task.getException());
	}
}
