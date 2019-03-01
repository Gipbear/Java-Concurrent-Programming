package test;

import java.util.LinkedList;

public class Test5 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		list.removeFirst();
		list.removeFirst();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// public E remove() {
		// return removeFirst();
		// }
	}
}
