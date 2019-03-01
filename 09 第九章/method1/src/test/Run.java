package test;

import java.util.concurrent.ForkJoinPool;

import myaction.MyRecursiveAction;

public class Run {

	public static void main(String[] args) {
		try {
			ForkJoinPool pool = new ForkJoinPool();
			pool.execute(new MyRecursiveAction());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
