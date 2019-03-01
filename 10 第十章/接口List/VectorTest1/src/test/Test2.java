package test;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("1");
		vector.add("2");
		vector.add("3");

		// …Ë÷√Capacity÷µ
		vector.ensureCapacity(50);
		System.out.println(vector.capacity());

		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}

	}

}
