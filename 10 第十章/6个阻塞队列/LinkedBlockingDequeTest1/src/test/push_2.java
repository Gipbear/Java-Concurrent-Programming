package test;

import java.util.concurrent.LinkedBlockingDeque;

public class push_2 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
		deque.push("anyString1");
		deque.push("anyString2");
		deque.push("anyString3");
		System.out.println(deque.size());
	}

}
