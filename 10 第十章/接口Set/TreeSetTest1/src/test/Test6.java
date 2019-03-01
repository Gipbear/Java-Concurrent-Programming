package test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(9);
		set.add(1);
		set.add(2);
		// floor:<=
		System.out.println(set.floor(2));

	}
}
