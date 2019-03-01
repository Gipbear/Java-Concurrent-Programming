package test;

import java.util.Stack;

public class Test5 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.add("1");
		stack.add("2");
		stack.add("3");
		stack.add("4");

		System.out.println(stack.search("3"));

	}

}
