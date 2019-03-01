package test;

import extthread.MyThreadA;

public class Run {

	public static void main(String[] args) {
		MyThreadA a = new MyThreadA();
		a.setName("AA");
		a.start();
		System.out.println("main end!");
	}

}
