package mycallable;

public class MyRunnable implements Runnable {

	private String username;

	public MyRunnable(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		System.out.println("run! username=" + username + " "
				+ Thread.currentThread().getName());
	}

}
