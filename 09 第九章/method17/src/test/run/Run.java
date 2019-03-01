package test.run;

import java.util.concurrent.ForkJoinPool;
import mytask.MyRecursiveTask1;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask1 task11 = new MyRecursiveTask1();

		ForkJoinPool pool = new ForkJoinPool();
		System.out.println(pool.isQuiescent());
		pool.submit(task11);
		Thread.sleep(1000);
		System.out.println(pool.isQuiescent());
	}
}
