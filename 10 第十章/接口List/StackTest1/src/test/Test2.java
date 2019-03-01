package test;

import java.util.Stack;

public class Test2 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.add("1");
		stack.add("2");
		stack.add("3");
		stack.add("4");

		stack.push("top");

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());

	}

}
