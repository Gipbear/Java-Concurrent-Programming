package test2;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		MyServiceB service = new MyServiceB();

		ThreadB[] aArray = new ThreadB[100];
		for (int i = 0; i < aArray.length; i++) {
			aArray[i] = new ThreadB(service);
		}
		for (int i = 0; i < aArray.length; i++) {
			aArray[i].start();
		}
		Thread.sleep(3000);
		System.out.println(service.list.size());
		System.out.println("可以随机取得值：" + service.list.get(5));
	}

}
