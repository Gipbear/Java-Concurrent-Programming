package test1;

public class Test1 {

	public static void main(String[] args) {
		MyService1 service = new MyService1();
		ThreadA a = new ThreadA(service);
		ThreadA b = new ThreadA(service);

		a.start();
		b.start();

	}
}
