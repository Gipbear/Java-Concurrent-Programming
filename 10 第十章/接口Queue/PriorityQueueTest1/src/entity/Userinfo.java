package entity;

public class Userinfo {

	private int id;
	private String username;

	public Userinfo() {
		super();
	}

	public Userinfo(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
