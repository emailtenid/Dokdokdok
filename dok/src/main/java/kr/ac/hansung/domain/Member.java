package kr.ac.hansung.domain;

public class Member {

	private String id;
	private String password;
	private String name;
	private int point;
	private int level;
	private String meber_url;

	public Member() {

	}

	public Member(String id, String password, String name, int point, int level) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password +  "]";
	}
}
