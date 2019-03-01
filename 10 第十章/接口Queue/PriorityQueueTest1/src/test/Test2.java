package test;

import java.util.PriorityQueue;

import myComparator.MyUserinfoComparator;
import entity.Userinfo;

public class Test2 {

	public static void main(String[] args) {
		PriorityQueue<Userinfo> pqRef = new PriorityQueue<Userinfo>(10,
				new MyUserinfoComparator());
		pqRef.add(new Userinfo(100, "username100"));
		pqRef.add(new Userinfo(99, "username99"));
		pqRef.add(new Userinfo(98, "username98"));
		pqRef.add(new Userinfo(2, "username2"));
		pqRef.add(new Userinfo(1, "username1"));

		System.out.println(pqRef.poll().getId());
		System.out.println(pqRef.poll().getId());
		System.out.println(pqRef.poll().getId());
		System.out.println(pqRef.poll().getId());
		System.out.println(pqRef.poll().getId());
		System.out.println(pqRef.size());
	}

}
