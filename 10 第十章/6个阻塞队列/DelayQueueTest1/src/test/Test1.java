package test;

import java.util.concurrent.DelayQueue;

import entity.Userinfo;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {

		DelayQueue<Userinfo> queue = new DelayQueue<Userinfo>();
		queue.add(new Userinfo(7, "username5"));
		queue.add(new Userinfo(6, "username4"));
		queue.add(new Userinfo(5, "username3"));
		queue.add(new Userinfo(4, "username2"));
		queue.add(new Userinfo(3, "username1"));

		System.out.println("          " + System.currentTimeMillis());

		System.out.println(queue.take().getUsername() + " "
				+ System.currentTimeMillis());
		System.out.println(queue.take().getUsername() + " "
				+ System.currentTimeMillis());
		System.out.println(queue.take().getUsername() + " "
				+ System.currentTimeMillis());
		System.out.println(queue.take().getUsername() + " "
				+ System.currentTimeMillis());
		System.out.println(queue.take().getUsername() + " "
				+ System.currentTimeMillis());

	}

}
