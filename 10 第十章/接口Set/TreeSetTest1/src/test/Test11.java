package test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test11 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(9);
		set.add(1);
		set.add(2);

		// subSet(1, 10)
		// >=1��<10
		set = (TreeSet) set.subSet(1, 10);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
