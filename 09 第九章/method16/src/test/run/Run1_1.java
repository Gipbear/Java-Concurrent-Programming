package test.run;

import java.util.concurrent.ForkJoinPool;

import mytask.MyRecursiveTask1;

public class Run1_1 {

	public static void main(String[] args) throws InterruptedException {
		MyRecursiveTask1 task1 = new MyRecursiveTask1();
		MyRecursiveTask1 task2 = new MyRecursiveTask1();
		MyRecursiveTask1 task3 = new MyRecursiveTask1();
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(task1);
		pool.submit(task2);
		pool.submit(task3);
		System.out.println("并行数getParallelism()=" + pool.getParallelism()
				+ " 线程池大小getPoolSize()=" + pool.getPoolSize());
		pool.shutdown();
		do {
		} while (!pool.isTerminated());
		System.out.println("main end!");
	}
}
