package test.run;

import java.util.concurrent.Exchanger;

import extthread.ThreadA;
import extthread.ThreadB;

public class Run {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		ThreadB b = new ThreadB(exchanger);
		a.start();
		b.start();
	}

}
