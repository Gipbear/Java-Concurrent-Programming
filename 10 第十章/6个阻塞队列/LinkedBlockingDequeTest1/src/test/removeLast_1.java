package test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class removeLast_1 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
		deque.addFirst("anyString1");
		deque.addFirst("anyString2");
		deque.addFirst("anyString3");
		System.out.println(deque.removeLast());
		System.out.println();
		Iterator iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
