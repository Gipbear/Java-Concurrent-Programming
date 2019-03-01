package test;

import java.util.LinkedList;

public class Test24 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");

		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());

	}
}
