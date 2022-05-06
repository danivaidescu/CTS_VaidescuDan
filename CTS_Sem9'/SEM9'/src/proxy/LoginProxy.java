package proxy;

public class LoginProxy implements ILoginModule {
	
	int counter = 0;
	
	ILoginModule loginModule;
	
	

	public LoginProxy(ILoginModule loginModule) {
		super();
		this.loginModule = loginModule;
	}



	@Override
	public boolean login(String username, String password) {
		if(counter >= 3) {
			return false;
		} else {
			boolean result = this.loginModule.login(username, password);
			
			if(!result) {
				counter ++;
			} else {
				counter = 0;
			}
			
			return result;
		}	
	}

}
