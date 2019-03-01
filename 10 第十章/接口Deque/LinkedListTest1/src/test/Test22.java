package test;

import java.util.LinkedList;

public class Test22 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");

		System.out.println(list.offerFirst("y"));
		System.out.println(list.offerFirst("x"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
