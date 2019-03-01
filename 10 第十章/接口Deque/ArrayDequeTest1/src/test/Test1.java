package test;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		ArrayDeque deque = new ArrayDeque();
		// 无deque.get(index);方法
		LinkedList llRef = new LinkedList();
		// 有llRef.get(index);方法
		// 如果只想实现从队列两端取数据则使用ArrayDeque
		// 如果想实现从队列两端取数据还可以随着索引的位置取数据
		// 则使用LinkedList
	}

}
