package test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class removeFirstOccurrence_1 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(10);
		deque.addLast("a");
		deque.addLast("b");
		deque.addLast("c");
		deque.addLast("a");
		deque.addLast("d");
		deque.addLast("e");
		deque.addLast("d");
		Iterator iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		System.out.println(deque.removeFirstOccurrence("a"));
		System.out.println();
		iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
