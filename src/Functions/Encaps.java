package Functions;

public class Encaps {
	private String username;
	private String password;

	public void setUsername(String username) {
		this.username = username;

	}

	public void setPassword(String password) {
		this.password = password;

	}

	public String getUsername() {
		System.out.println("getusername method output " + username);
		return username;
	}

	public String getPassword() {
		return password;

	}

}
