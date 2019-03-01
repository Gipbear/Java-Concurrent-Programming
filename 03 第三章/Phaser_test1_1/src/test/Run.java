package test;

import java.util.concurrent.Phaser;

import tools.PrintTools;
import extthread.ThreadA;
import extthread.ThreadB;
import extthread.ThreadC;

public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		PrintTools.phaser = phaser;

		ThreadA a = new ThreadA(phaser);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(phaser);
		b.setName("B");
		b.start();

		ThreadC c = new ThreadC(phaser);
		c.setName("C");
		c.start();
	}
}
