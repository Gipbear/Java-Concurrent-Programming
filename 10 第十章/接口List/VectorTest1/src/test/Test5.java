package test;

import java.util.Enumeration;
import java.util.Vector;

public class Test5 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("1");// 0
		vector.add("2");// 1
		vector.add("5");// 2
		vector.add("5");// 3
		vector.add("5");// 4

		System.out.println(vector.lastIndexOf("5", 4));

	}

}
