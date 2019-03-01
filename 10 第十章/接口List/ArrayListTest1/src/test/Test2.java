package test;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("大中国1");
		list.add("大中国2");
		list.add(1, "我是第二位");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
