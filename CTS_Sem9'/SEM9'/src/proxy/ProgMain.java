package proxy;

public class ProgMain {

	public static void main(String[] args) {
		
		
		ILoginModule loginModule = new LoginModule("Daniel", "1234");
		
		String[] dictionaryPasswords = new String[] {"12345678", "123456", 
				"password", "12345", "1234"};
		
		
		for(String passTry : dictionaryPasswords) {
			if(loginModule.login("Daniel", passTry)) {
				System.out.println("WE DID IT!");
			} 
		}
		
		System.out.println("OOOOPS");
		
		LoginProxy proxyLoginModule = new LoginProxy(loginModule);
		
		for(String passTry: dictionaryPasswords) {
			if(proxyLoginModule.login("Daniel", passTry)) {
				System.out.println("WE DID IT !!!!");
			} 
			 
		}
		
		System.out.println("OOOOOOOOOOPS!");
		
		
		
	}

}
