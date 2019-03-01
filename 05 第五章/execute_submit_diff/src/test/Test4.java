package test;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test4 {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(50,
				Integer.MAX_VALUE, 5, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		executor.setThreadFactory(new ThreadFactory() {
			@Override
			public Thread newThread(Runnable r) {
				Thread t = new Thread(r);
				t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
					@Override
					public void uncaughtException(Thread t, Throwable e) {
						System.out.println("execute()方法通过使用自定义");
						System.out.println("ThreadFactory也能捕获异常了");
						e.printStackTrace();
					}
				});
				return t;
			}
		});
		executor.execute(new Runnable() {
			@Override
			public void run() {
				Integer.parseInt("a");
			}
		});
	}
}
