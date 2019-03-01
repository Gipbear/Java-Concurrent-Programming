package test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test7 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(9);
		set.add(1);
		set.add(2);
		// lower:<
		System.out.println(set.lower(2));

	}
}
