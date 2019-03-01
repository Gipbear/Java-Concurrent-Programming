package test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import extthread.MyThreadA;

public class Run {

	public static void main(String[] args) {
		MyThreadA a = new MyThreadA();

		LinkedBlockingDeque queue = new LinkedBlockingDeque(2);
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
				TimeUnit.SECONDS, queue,
				new ThreadPoolExecutor.CallerRunsPolicy());
		System.out.println("a begin " + Thread.currentThread().getName() + " "
				+ System.currentTimeMillis());
		pool.execute(a);
		pool.execute(a);
		pool.execute(a);
		pool.execute(a);
		pool.execute(a);
		pool.execute(a);
		System.out.println("a   end " + Thread.currentThread().getName() + " "
				+ System.currentTimeMillis());
	}

}
