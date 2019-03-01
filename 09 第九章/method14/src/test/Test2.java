package test;

import java.util.concurrent.ForkJoinPool;

import mytask.MyRecursiveTask;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask action = new MyRecursiveTask();
		ForkJoinPool pool = new ForkJoinPool();
		String returnString = pool.invoke(action);
		System.out.println(returnString);
	}
}
