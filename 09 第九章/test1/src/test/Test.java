package test;

import java.util.concurrent.ForkJoinPool;
import action.MyRecursiveAction;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(new MyRecursiveAction());
		Thread.sleep(5000);
	}

}
