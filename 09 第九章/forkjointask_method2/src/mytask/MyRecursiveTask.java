package mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {

	@Override
	protected Integer compute() {
		try {
			Thread.sleep(1000);
			Integer.parseInt("a");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			throw e;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 100;
	}

}
