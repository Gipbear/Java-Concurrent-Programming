package mytask;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveTask1 extends RecursiveAction {
	protected void compute() {
		try {
			System.out.println("begin=" + Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("  end=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
