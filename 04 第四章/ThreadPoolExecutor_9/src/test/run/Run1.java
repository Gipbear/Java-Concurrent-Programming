package test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("打印了！begin "
							+ Thread.currentThread().getName());
					Thread.sleep(4000);
					System.out.println("打印了！      end "
							+ Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println("线程池中的线程数A：" + executor.getPoolSize());
		System.out.println("Z1=" + executor.prestartCoreThread());
		System.out.println("线程池中的线程数B：" + executor.getPoolSize());
		System.out.println("Z2=" + executor.prestartCoreThread());
		System.out.println("线程池中的线程数C：" + executor.getPoolSize());
		System.out.println("Z3=" + executor.prestartCoreThread());// 无效代码
		System.out.println("Z4=" + executor.prestartCoreThread());// 无效代码
		System.out.println("Z5=" + executor.prestartCoreThread());// 无效代码
		System.out.println("Z6=" + executor.prestartCoreThread());// 无效代码
		System.out.println("线程池中的线程数D：" + executor.getPoolSize());
	}

}
