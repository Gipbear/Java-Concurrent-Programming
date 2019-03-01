package myrunnable;

import entity.Userinfo;

public class MyRunnable implements Runnable {
	private Userinfo userinfo;

	public MyRunnable(Userinfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		userinfo.setUsername("usernameValue");
		userinfo.setPassword("passwordValue");
		System.out.println("run ‘À––¡À ");
	}
}
