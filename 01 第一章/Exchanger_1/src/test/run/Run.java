package test.run;

import java.util.concurrent.Exchanger;

import extthread.ThreadA;

public class Run {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		a.start();
		System.out.println("main end!");
	}

}
