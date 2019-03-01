package test;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");

		// 设置Vector中存储的个数
		vector.setSize(3);

		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

	}

}
