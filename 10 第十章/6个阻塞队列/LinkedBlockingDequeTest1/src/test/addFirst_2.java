package test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class addFirst_2 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
		deque.addFirst("anyString");
		deque.addFirst("anyString");
		deque.addFirst("anyString");
		System.out.println(deque.size());
	}

}
