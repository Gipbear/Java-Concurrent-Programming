package extthread;

import java.util.concurrent.Phaser;

import tools.PrintTools;

public class ThreadB extends Thread {

	private Phaser phaser;

	public ThreadB(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		PrintTools.methodA();
	}

}
