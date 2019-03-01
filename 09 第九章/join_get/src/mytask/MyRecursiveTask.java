package mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
	@Override
	protected Integer compute() {
		System.out.println(Thread.currentThread().getName() + " Ö´ÐÐcompute·½·¨()");
		String nullString = null;
		nullString.toString();
		return 100;
	}
}
