package test;

import java.util.concurrent.ForkJoinPool;

import myaction.MyRecursiveAction;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRecursiveAction action = new MyRecursiveAction();
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(action);
	}
}
