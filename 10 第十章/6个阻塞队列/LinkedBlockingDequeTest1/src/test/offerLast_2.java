package test;

import java.util.concurrent.LinkedBlockingDeque;

public class offerLast_2 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
		System.out.println(deque.offerLast("anyString1"));
		System.out.println(deque.offerLast("anyString2"));
		System.out.println(deque.offerLast("anyString3"));
		System.out.println(deque.offerLast("anyString4"));
		System.out.println(deque.size());
	}

}
