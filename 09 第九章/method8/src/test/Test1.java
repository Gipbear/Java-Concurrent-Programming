package test;

import java.util.concurrent.ForkJoinPool;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("main end!");
	}
}
