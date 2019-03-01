package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import task.MyRecursiveTaskA;
import task.MyRecursiveTaskB;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask<Integer> runTaskA = pool.submit(new MyRecursiveTaskA());
		ForkJoinTask<Integer> runTaskB = pool.submit(new MyRecursiveTaskB());
		System.out.println("×¼±¸´òÓ¡£º" + System.currentTimeMillis());
		System.out
				.println(runTaskA.join() + " A£º" + System.currentTimeMillis());
		System.out
				.println(runTaskB.join() + " B£º" + System.currentTimeMillis());
		Thread.sleep(5000);
	}
}
