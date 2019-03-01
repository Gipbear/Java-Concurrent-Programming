package test;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");

		String[] stringArray = new String[vector.size()];

		vector.copyInto(stringArray);

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

	}

}
