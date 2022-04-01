package s5.singleton.v2;

// Early Initialization
public class Database {
	
	private static Database INSTANCE;
	
	static { 								// intr un bloc static pute sa arunca exceptie
		INSTANCE = new Database();
	}
	
	private Database() {
		// Facem ceva		
	}
	
	public Database getInstance() {
		return INSTANCE;
	}

}
