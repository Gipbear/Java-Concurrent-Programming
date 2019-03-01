package test.run;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import myrunnable.MyRunnable;
import entity.Userinfo;

public class Run3 {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		Userinfo userinfo = new Userinfo();
		MyRunnable runnable = new MyRunnable(userinfo);

		ForkJoinPool pool = new ForkJoinPool();
		Future<Userinfo> future = pool.submit(runnable, userinfo);
		System.out.println(future);
		// 建议使用此种方式future.get()
		// 因为get()方法呈阻塞效果
		System.out.println("userinfo username=" + future.get().getUsername());
	}
}
