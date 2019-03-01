package test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class removeLastOccurrence_2 {

	public static void main(String[] args) {
		LinkedBlockingDeque deque = new LinkedBlockingDeque(10);
		System.out.println(deque.removeLastOccurrence("d"));
	}

}
