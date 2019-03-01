package test.run;

import java.util.concurrent.ForkJoinPool;

import myrunnable.MyRunnable;
import entity.Userinfo;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		Userinfo userinfo = new Userinfo();
		MyRunnable runnable = new MyRunnable(userinfo);

		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(runnable, userinfo);
		Thread.sleep(2000);
		// 上面使用sleep不标准，因为执行时间不固定
		// 如果打印的早则有可能出现打印null值的情况
		System.out.println("userinfo username=" + userinfo.getUsername());
		Thread.sleep(2000);
	}
}
