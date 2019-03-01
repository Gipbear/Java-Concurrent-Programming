package task;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTaskB extends RecursiveTask<Integer> {

	@Override
	protected Integer compute() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin B "
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + "   end B "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 100;
	}

}
