package proxy;

public class LoginModule implements ILoginModule {
	
	private String username;
	private String password;
	
	

	public LoginModule(String usernamme, String password) {
		super();
		this.username = usernamme;
		this.password = password;
	}


	public String getUsernamme() {
		return username;
	}

	public void setUsernamme(String usernamme) {
		this.username = usernamme;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public boolean login(String username, String password) {
		
		if(this.username.equals(username) && this.password.equals(password))
			return true;
		
		
		return false;
	}

}
