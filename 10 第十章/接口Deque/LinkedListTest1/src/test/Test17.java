package test;

import java.util.LinkedList;

public class Test17 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list.pop());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
