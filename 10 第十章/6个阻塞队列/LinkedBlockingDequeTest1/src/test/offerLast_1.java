package test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class offerLast_1 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
		System.out.println(deque.offerLast("anyString1"));
		System.out.println(deque.offerLast("anyString2"));
		System.out.println(deque.offerLast("anyString3"));
		System.out.println(deque.size());
		Iterator iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
