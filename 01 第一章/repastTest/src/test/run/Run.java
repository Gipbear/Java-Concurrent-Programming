package test.run;

import service.RepastService;
import extthread.ThreadC;
import extthread.ThreadP;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		RepastService service = new RepastService();
		ThreadP[] arrayP = new ThreadP[60];
		ThreadC[] arrayC = new ThreadC[60];
		for (int i = 0; i < 60; i++) {
			arrayP[i] = new ThreadP(service);
			arrayC[i] = new ThreadC(service);
		}
		Thread.sleep(2000);
		for (int i = 0; i < 60; i++) {
			arrayP[i].start();
			arrayC[i].start();
		}
	}

}
