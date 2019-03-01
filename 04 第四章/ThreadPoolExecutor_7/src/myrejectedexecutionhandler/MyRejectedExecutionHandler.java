package myrejectedexecutionhandler;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

import myrunnable.MyRunnable1;

public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(((MyRunnable1) r).getUsername() + " ±»¾Ü¾øÖ´ÐÐ");
	}
}
