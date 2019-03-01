package service;

import java.util.ArrayList;

public class MyServiceA {
	public ArrayList list = new ArrayList();

	public MyServiceA() {
		super();
		for (int i = 0; i < 10000; i++) {
			list.add("myString");
		}
	}

	public void serviceMethod() {
		list.remove(0);
	}

}
