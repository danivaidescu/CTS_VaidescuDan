package s5.singleton;


// Early Initialization
public class Database {
	
	private static Database INSTANCE = new Database();
	
	private Database() {
		// Facem ceva		
	}
	
	public Database getInstance() {
		return INSTANCE;
	}

}
