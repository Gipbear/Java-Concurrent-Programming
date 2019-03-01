package test;

import java.util.concurrent.Phaser;

import extthread.ThreadA;

public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		ThreadA a = new ThreadA(phaser);
		a.start();
	}
}
