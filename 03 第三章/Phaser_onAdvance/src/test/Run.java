package test;

import java.util.concurrent.Phaser;

import service.MyService;
import extthread.ThreadA;
import extthread.ThreadB;

public class Run {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(2) {
			protected boolean onAdvance(int phase, int registeredParties) {
				System.out
						.println("protected boolean onAdvance(int phase, int registeredParties)被调用！");
				return false;
				// 返回true不等待了，Phaser呈无效/销毁的状态
				// 返回false则Phaser继续工作
			}
		};

		MyService service = new MyService(phaser);

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
