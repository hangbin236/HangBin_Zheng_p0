package model;

public class UserPojo {

	private int userId;
	private String username;
	private String password;
	private String addUsers;

	public UserPojo() {
		super();
	}

	public UserPojo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserPojo(int userID, String username, String password) {
		super();
		this.userId = userID;
		this.username = username;
		this.password = password;
	}

	public UserPojo(int userId, String username, String password, String addUsers) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.addUsers = addUsers;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddUsers() {
		return addUsers;
	}

	public void setAddUsers(String addUsers) {
		this.addUsers = addUsers;
	}

	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", username=" + username + ", password=" + password + ", addUsers="
				+ addUsers + "]";
	}

}
