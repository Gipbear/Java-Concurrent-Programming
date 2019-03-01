package mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
	@Override
	protected Integer compute() {
		System.out.println("compute time=" + System.currentTimeMillis());
		return 100;
	}
}
