package test;

import java.util.concurrent.Phaser;

import extthread.ThreadA;
import extthread.ThreadB;

public class Run1 {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		ThreadA a = new ThreadA(phaser);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(phaser);
		b.setName("B");
		b.start();
	}
}
