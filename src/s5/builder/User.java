package s5.builder;

public class User {
	
	// mandatory attributes
	
	private String username;
	private String firstName;
	private String lastName;
	
	
	// optional attributes
	
	private String birthDate;
	private String address;
	private String phoneNumber;
	
	User(String username, String firstName, String lastName) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	User(String username, String firstName, String lastName, String birthDate) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate= birthDate;
	}
	
	//................etc

}
