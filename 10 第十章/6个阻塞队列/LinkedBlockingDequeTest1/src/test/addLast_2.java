package test;

import java.util.concurrent.LinkedBlockingDeque;

public class addLast_2 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
		deque.addLast("anyString1");
		deque.addLast("anyString2");
		deque.addLast("anyString3");
		System.out.println(deque.size());
	}

}
