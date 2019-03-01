package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import mytask.MyRecursiveTask;

public class Test1 {

	public static void main(String[] args) {
		try {
			MyRecursiveTask task1 = new MyRecursiveTask();
			ForkJoinPool pool = new ForkJoinPool();
			ForkJoinTask task2 = pool.submit(task1);
			System.out.println(task2.get());
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("进入了mainA");
		} catch (ExecutionException e) {
			e.printStackTrace();
			System.out.println("进入了mainB");
		}
		System.out.println("main end");
	}

}
