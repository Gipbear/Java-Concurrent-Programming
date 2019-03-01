package test.run;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

	public static void main(String[] args) {
		// poll方法：获取并移除表示下一个已完成任务的 Future，如果不存在这样的任务，则返回 null
		ExecutorService executorService = Executors.newCachedThreadPool();
		CompletionService csRef = new ExecutorCompletionService(executorService);
		for (int i = 0; i < 1; i++) {
			csRef.submit(new Callable<String>() {
				public String call() throws Exception {
					Thread.sleep(3000);
					System.out.println("3秒过后了");
					return "高洪岩3s";
				}
			});
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(csRef.poll());
		}
	}
}
