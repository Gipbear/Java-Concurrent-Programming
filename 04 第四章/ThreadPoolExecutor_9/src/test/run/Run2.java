package test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("打印了！begin "
						+ Thread.currentThread().getName());
				System.out.println("打印了！      end "
						+ Thread.currentThread().getName());
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println("线程池中的线程数A：" + executor.getPoolSize());
		System.out.println("启动核心线程数量为：" + executor.prestartAllCoreThreads());
		System.out.println("线程池中的线程数B：" + executor.getPoolSize());
	}

}
