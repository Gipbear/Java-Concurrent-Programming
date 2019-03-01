package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("a1");
		set.add("x");
		set.add("y");
		set.add("z");

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
