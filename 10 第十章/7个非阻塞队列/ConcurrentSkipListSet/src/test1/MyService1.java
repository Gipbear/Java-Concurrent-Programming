package test1;

import java.util.concurrent.ConcurrentSkipListSet;

public class MyService1 {

	public ConcurrentSkipListSet map = new ConcurrentSkipListSet();

	public MyService1() {
		Userinfo userinfo1 = new Userinfo(1, "username1");
		Userinfo userinfo3 = new Userinfo(3, "username3");
		Userinfo userinfo5 = new Userinfo(5, "username5");
		Userinfo userinfo4 = new Userinfo(4, "username4");
		Userinfo userinfo44 = new Userinfo(4, "username4");
		Userinfo userinfo2 = new Userinfo(2, "username2");
		map.add(userinfo1);
		map.add(userinfo3);
		map.add(userinfo5);
		map.add(userinfo4);
		map.add(userinfo44);
		map.add(userinfo2);
	}
}
