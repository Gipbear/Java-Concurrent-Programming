package test.run;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

	public static void main(String[] args) {
		try {
			// take方法：获取并移除表示下一个已完成任务的 Future，如果目前不存在这样的任务，则等待。
			ExecutorService executorService = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(
					executorService);
			for (int i = 0; i < 10; i++) {
				csRef.submit(new Callable<String>() {
					public String call() throws Exception {
						long sleepValue = (int) (Math.random() * 1000);
						System.out.println("sleep=" + sleepValue + " "
								+ Thread.currentThread().getName());
						Thread.sleep(sleepValue);
						return "高洪岩：" + sleepValue + " "
								+ Thread.currentThread().getName();
					}
				});
			}
			for (int i = 0; i < 10; i++) {
				System.out.println(csRef.take().get());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}
