package test;

import java.util.concurrent.LinkedBlockingDeque;

public class putLast_2 {

	public static void main(String[] args) {
		try {
			LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
			deque.putLast("anyString1");
			System.out.println("A");
			deque.putLast("anyString2");
			System.out.println("B");
			deque.putLast("anyString3");
			System.out.println("C");
			System.out.println(deque.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
