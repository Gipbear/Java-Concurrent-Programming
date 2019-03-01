package mytask;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveTask1 extends RecursiveAction {
	private int i = 0;

	protected void compute() {
		System.out.println("beginA=" + Thread.currentThread().getName());
		while (i < 100000) {
			String newString = new String();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println("  endA=" + Thread.currentThread().getName());
	}
}
