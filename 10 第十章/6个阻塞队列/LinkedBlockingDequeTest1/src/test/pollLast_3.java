package test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class pollLast_3 {

	public static void main(String[] args) {
		try {
			LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
			System.out.println(System.currentTimeMillis());
			System.out.println(deque.pollLast(4, TimeUnit.SECONDS));
			System.out.println(System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
