package extthread;

import java.util.concurrent.Phaser;

import tools.PrintTools;

public class ThreadC extends Thread {

	private Phaser phaser;

	public ThreadC(Phaser phaser) {
		super();
		this.phaser = phaser;
	}

	public void run() {
		PrintTools.methodB();
	}

}
