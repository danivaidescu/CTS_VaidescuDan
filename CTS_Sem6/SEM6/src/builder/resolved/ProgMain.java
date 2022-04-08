package builder.resolved;

public class ProgMain {

	public static void main(String[] args) {
		
		User user1 = new User.Userbuilder("daniel9", "0000", "vaidescu@yahoo.com").address("Bucharest").build();

	}

}
