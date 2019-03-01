package test1;

public class Test1 {
	public static void main(String[] args) {
		MyServiceA service = new MyServiceA();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
