package mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask2 extends RecursiveTask<Integer> {

	private int beginPosition;
	private int endPosition;

	public MyRecursiveTask2(int beginPosition, int endPosition) {
		super();
		this.beginPosition = beginPosition;
		this.endPosition = endPosition;
	}

	protected Integer compute() {
		Integer sumValue = 0;
		if ((endPosition - beginPosition) > 2) {
			int middleNum = (endPosition + beginPosition) / 2;
			MyRecursiveTask2 leftTask = new MyRecursiveTask2(beginPosition,
					middleNum);
			MyRecursiveTask2 rightTask = new MyRecursiveTask2(middleNum + 1,
					endPosition);

			leftTask.fork();
			rightTask.fork();

			Integer leftValue = leftTask.join();
			Integer rightValue = rightTask.join();

			return leftValue + rightValue;

		} else {
			int count = 0;
			for (int i = beginPosition; i <= endPosition; i++) {
				count = count + i;
			}
			return count;
		}
	}
}
