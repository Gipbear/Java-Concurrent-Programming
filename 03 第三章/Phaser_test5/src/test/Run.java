package test;

import java.util.concurrent.Phaser;

import extthread.MyThread;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Phaser phaser = new Phaser(7);
		MyThread[] myThreadArray = new MyThread[5];
		for (int i = 0; i < myThreadArray.length; i++) {
			myThreadArray[i] = new MyThread(phaser);
			myThreadArray[i].setName("Thread" + (i + 1));
			myThreadArray[i].start();
		}
		Thread.sleep(2000);
		System.out.println("已到达：" + phaser.getArrivedParties());
		System.out.println("未到达：" + phaser.getUnarrivedParties());

	}
}
