package test;

import java.util.concurrent.LinkedBlockingDeque;

public class takeLast_1 {

	public static void main(String[] args) {
		try {
			LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
			deque.addLast("anyString1");
			deque.addLast("anyString2");
			deque.addLast("anyString3");
			System.out.println(deque.takeLast());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
